package higherOrderLambda

fun main(args: Array<String>) {

    val program = ProgramClass()

    //var myLmbda = { x: Int, y: Int -> x + y }
    var myLmbda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    // We can write this as like
    program.addTwoNumber(4, 7, myLmbda)

    // We can write this as like
    program.addTwoNumber(4, 7, { x: Int, y: Int -> x + y })

    // We can write this as like
    program.addTwoNumber(4, 7) { x: Int, y: Int -> x + y }
}

class ProgramClass {

    fun addTwoNumber(a: Int, b: Int, action: (Int, Int) -> Int) {                   // High level function with lambda parameter
        var result  = action(a, b)   // calls the println(s) in lambda expression
        println(result)
    }
}