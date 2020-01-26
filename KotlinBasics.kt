fun main(args: Array<String>) {
    println("Hello World !")

    variablesAndBasicTypes();
    operators();
}

/**
 * val (Immutable reference) - The variable declared using val keyword cannot be changed once the value is assigned.
 * It is similar to final variable in Java.
 * var (Mutable reference) - The variable declared using var keyword can be changed later in the program.
 * It corresponds to regular Java variable.
 */
fun variablesAndBasicTypes() {
    var language = "French"
    // or
    val name: String = "Firoz"

    val score = 95 // (type Int - to check press ctrl+shift+p)

    language = "English"

    var range: Byte = 112
    println("$range")
}

fun operators(){
    val number1 = 12.5
    val number2 = 3.5

    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")
}