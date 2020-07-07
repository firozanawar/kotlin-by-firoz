package KotlinByCaster

/**  kotlin-class-primary-constructor */
//class User {  // Normal class without constructor
//class User constructor(var firstName: String, var lastName: String) {  // Class with Primary constructor
class User(
    var firstName: String,
    var lastName: String,
    isPlatinum: Boolean
) { // Class with with constructor keyword because no..
// ..access modifier is placed before constructor keyword so we removed it.

//    var firstName: String = ""
//    var lastName: String = ""

    /** kotlin-overriding-the-property-getter */
    /** kotlin-overriding-the-property-setter */
    var fullName = "$firstName $lastName"
        get() = "Name : $field"  //  here field gives the fullName, field is called the backing field.
        set(value) {
            if (value.startsWith("firoz")) {
                field = "Firox Anwar"
            }
        }

    /** kotlin-lateinit-modifier- */
    lateinit var favouriteCity: String

    /** kotlin-init-block */
    // Called after primary-constructor
    // Init block could be multiple.
    init {
        println("init 1 called")
    }

    init {
        println("init 2 called")
    }

    /**  kotlin-class-multiple-constructor */
    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
        println("2nd constructor")
    }

    constructor(firstName: String) : this(firstName, "Unkwnown") {
        println("3nd constructor")
    }


    fun printName() {
        println("$firstName $lastName")
    }

    /** Kotlin companion object is like static in java, class level functions behave as singleton*/
    companion object {

        /** declaring-constants-in-kotlin */
        const val MAX_AGE = 18

        fun createUser(): User {
            return User("Firoz", "Inizmam")
        }
    }
}