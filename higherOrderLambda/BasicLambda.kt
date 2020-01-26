package higherOrderLambda

fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumber(2, 7)

    program.addTwoNumber(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println("Sum using interface is $sum")
        }
    })

    val test: String = "Hello"

    // lambda expression can be assigned to some variable.
    // val mylambda = { s -> println(s)}  // Where s is parameter and println(s) is body

    // We can also declare the type of expression to the lambda variable similar to test variable
    val mylambda: (Int) -> Unit =
        { s -> println(s) }  // Where s is parameter(type int) and println(s) is body (type Unit)

    program.addTwoNumber(2, 7, mylambda)
}

class Program {

    fun addTwoNumber(a: Int, b: Int, action: (Int) -> Unit) {  // High level function with lambda parameter
        var sum = a + b
        action(sum)   // calls the println(s) in lambda expression
    }

    fun addTwoNumber(a: Int, b: Int, action: MyInterface) {  // Using interface, object oriented way
        var sum = a + b
        action.execute(sum)
    }

    fun addTwoNumber(a: Int, b: Int) {  // Simple way
        var sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}