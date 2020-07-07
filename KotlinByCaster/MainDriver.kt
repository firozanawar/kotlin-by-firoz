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
    var name: String = "Firoz Anwar"
    println(name.length)
    println(name.decapitalize())
    println(name.toLowerCase())

    var c: Char = 'x'  // 16-bits Unicode Character

    /** kotlin-string-interpolation-and-triple-quotes **/
    var message = """
        Hello
        How are you?
        I am great
    """.trimMargin(">>>")
    println(message)

    /**
     * O/P - trimIndent()
     *  Hello
    How are you?
    I am great

     * O/p - replaceIndent("Messge-|-")
     *  Messge-|-Hello
    Messge-|-How are you?
    Messge-|-I am great

     * O/p - trimMargin(">>>")
     *          Hello
    How are you?
    I am great
     */

    val myName: String = "Firoz Anwar"
    val myAge: Int = 30
    println("My name is ${myName} and my age is ${myAge}")

    /** kotlin-data-types-boolean */
    var isBlank: Boolean = false
    println(isBlank)        // return false
    println(isBlank.not())  // return true

    /** kotlin-conditionals-ifelse
     * kotlin-conditionals-single-line-ifelse */
    val calories = 2400
    if (calories > 2000) {
        println("You have consumed all colories for day")
    } else {
        println("You still needs to consume some calories")
    }

    val num = 11
    if (num > 10) println("Number is greater than 10") else println("Age is less than 10")

    /** kotlin-conditionals-truth-tables */
    // for AND use &&
    // for OR use ||

    /** kotlin-equality */
    // 1. Structure equality, use ==, !=
    val name1 = "Firoz"
    val name2 = "Anwar"
    println(name1 == name2)
    //println(name1.equals(name2))
    println(name1 != name2)

    // 2. Referential equality, use ===
    val a = 12
    val b = 12
    println(a === b) // true - because Number, Char and Boolean behave like a primitive.

    val p1 = Person("Donn")
    val p2 = Person("Donn")
    println(p1 === p2)   // print false

    /** kotlin-nullable-safe-calls */
    var nameNew: String? = "Firoz"
    nameNew = null
    val length = nameNew?.length
    println(length)

    nameNew = "Anwar"
    val lengthNew = nameNew?.substring(0, 2).length
    println(lengthNew)

    /** kotlin-elvis-operator */
    var hisName: String? = "Inzimam Islam"
    val l = hisName?.substring(0, 2)?.length  // Output actual length or 0
    hisName = null // if uncomment this line this will give 0 below.
    // But we don't want that null, we want our own value then use Elvis operator(?:)
    val le = hisName?.substring(0, 2)?.length ?: 0  // Output actual length or 0
    println(le)

    /** declaring-constants-in-kotlin */
    println(User.MAX_AGE)
    println(Constant.MIN_AGE)

    /** kotlin-lateinit-modifier- */
    val user = User("Firoz", "Anwar")
    user.favouriteCity = "Delhi"
    println(user.favouriteCity)

    /** Enum in sKotlin */

    val accountType: AccountType = AccountType.BRONZE
    println(accountType)
//    val flag = AccountType.valueOf("gold").toString().toUpperCase() == AccountType.GOLD;

    /** kotlin-enum-constructor-parameters */
    val accountTypeWithParam: AccountTypeWithParam = AccountTypeWithParam.GOLD
    println(accountTypeWithParam)
    println(accountTypeWithParam.discountPer)
    println(accountTypeWithParam.noOfSubscription)

    /** abstract-functions-inside-of-kotlin-enums */
    val accountTypeWithAbs: AccountTypeWithAbstractFun = AccountTypeWithAbstractFun.GOLD
    println(accountTypeWithAbs.calculatePercentage())

    /** iterating-over-enum-values-in-kotlin */
    for(accouns in AccountType.values()){
        println(accouns)
    }

    // or
    AccountType.values().forEach { println(it) }

    /** adding-static-methods-to-kotlin-enums */

}

class Person(val name: String)

enum class AccountType {
    BRONZE,
    GOLD,
    SILVER,
    PLATINUM
}

enum class AccountTypeWithParam(val discountPer: Int, val noOfSubscription: Int) {
    BRONZE(10, 1),
    GOLD(20, 5),
    SILVER(30, 10),
    PLATINUM(40, 15)
}

/** abstract-functions-inside-of-kotlin-enums */
enum class AccountTypeWithAbstractFun {
    BRONZE {
        override fun calculatePercentage(): Int {
            TODO("Not yet implemented")
            return 5
        }
    },
    GOLD {
        override fun calculatePercentage(): Int = 10
    },
    SILVER {
        override fun calculatePercentage(): Int = 15
    },
    PLATINUM {
        override fun calculatePercentage(): Int = 20
    };

    abstract fun calculatePercentage(): Int
}




