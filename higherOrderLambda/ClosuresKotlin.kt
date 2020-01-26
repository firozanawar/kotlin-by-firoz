package higherOrderLambda

fun main(args: Array<String>) {

    var result  = 0  // outside

    val program = ProgramClosure()
    // We can write this as like
    program.addTwoNumber(4, 7) { x: Int, y: Int -> result = x + y }
    println(result)
}

class ProgramClosure {

    fun addTwoNumber(a: Int, b: Int, action: (Int, Int) -> Unit) {
        action(a, b)   // result  = x + y = a + b = 4 + 7 = 11
    }
}