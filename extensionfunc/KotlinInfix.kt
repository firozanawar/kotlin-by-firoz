package extensionfunc

fun main(args: Array<String>) {

    var x: Int = 6
    var y: Int = 8
    println(x.greaterValue(y))  // Extension function
    println(x greaterValue y)  // Infix function  //  Better readability
}

infix fun Int.greaterValue(other: Int): Int {
    return if (this > other) this else other
}