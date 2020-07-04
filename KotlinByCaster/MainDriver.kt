package KotlinByCaster


fun main() {
    println("Hellow World !")

    /** Variables in Kotlin **/
    var fullName = "Firoz Anwar"
    println(fullName)

    fullName = ""
    println(fullName.isEmpty()) // return true

    var age: Int = 30  // Defining the variable type like String, Int,
    println("The age is ${age}")

    val countryName = "india"
    //countryName = "US" // Can't be re-assigned
    println(countryName)

    val myByte: Byte = 8    // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32     // 32-bit signed integer
    val myLog: Long = 64    // 32-bit signed integer

    // Decimal
    val myFloat: Float = 32.00f  // 32-bit floating point number
    val myDouble: Double = 64.00  // 64-bit floating point number

    // Number - Int, Double etc extends the Number class
    println(myByte.toDouble())      //  print 8.0
    println(myByte.toDouble()::class) // print class kotlin.Double

    // Special type of initialization of variables for more readablility
    val bigLong: Long = 1_000_000
    println(bigLong)  // Print 1000000

    // .plus, .minus, .times
    val newInt = myInt.plus(12)
    println(newInt)  // Print 44

    val newTimes = myInt.times(12)
    println(newTimes)  // Print 384

    /** kotlin-data-types-string-and-char **/
    var name : String = "Firoz Anwar"
    println(name.length)
    println(name.decapitalize())
    println(name.toLowerCase())

    var c: Char = 'x'  // 16-bits Unicode Character


}



