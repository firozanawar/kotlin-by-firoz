package KotlinByDonnFelker

fun main(){
    println("Hello World")

    // Variables // Use var or val
    var firstName = "Firoz"  // Mutable variable
    firstName = "Firoz Anwar"
    println(firstName)

    // Check the variable property
    println(firstName.isEmpty())
    println(firstName::class) // Getting the type of variable
    println(firstName.length)
    println(firstName.decapitalize()) // This will do only 1st word.
    println(firstName.toLowerCase())

    // Read only variable, Immutable
    val age: Int = 31; // or val age = 31; -> Omit the data type //
    // age = 32 // Read only variable -> Not possible
    println(age)

    // Numbering
    // Everything in Kotlin is object. So we can call property of its like myByte.toLong() or myByte.toLong()::class
    // Byte, Short, Int, Long all extends the Number class.
    val myByte: Byte = 8    // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32     // 32-bit signed integer
    val myLog: Long = 64    // 32-bit signed integer

    // Decimal
    val myFloat: Float = 32.00f  // 32-bit floating point number
    val myDouble: Double = 64.00  // 64-bit floating point number

    println(myByte.toLong())
    println(myByte.toLong()::class)
    println(1_000_1000) // Built-in syntax, more readable
    println(myInt + 18)
    println(myInt.plus(12))
    println(myInt.minus(8))
    println(myInt.times(8))

    var c: Char = 'x' // 16 bit unicode character
    var foo: String = "y" // This also works

    // Boolean
    val isFlagTrue: Boolean = false
    println(isFlagTrue.not())

    val number = 50
    val result = number in 1..50   // last digit considered
    val result1 = number in 1 until 50    // last digit skipped/not considered
    println(result)
    println(result1)
}