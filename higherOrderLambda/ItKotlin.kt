package higherOrderLambda

fun main(args: Array<String>) {
    var pgm = ReverseProgram();
    pgm.reverse("Hello", { s -> s.reversed()})

    // We can write this like this // it is the name of single parameter.
    pgm.reverse("Hello", { it.reversed()})  // it ===> s -> s. // For only one parameter
}

class ReverseProgram {

    fun reverse(str: String, myFunc: (String) -> String) {
        var rsult  = myFunc(str)   // it.reversed() -> str.reversed()  -> "Hello".reversed()  -> olleH
        println(rsult)
    }
}