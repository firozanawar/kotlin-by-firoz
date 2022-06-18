package KotlinByDonnFelker

fun main(){
    val human1 = HUman()
    human1.name = "Firoz"
    human1.printName()

    val human2 = HUman()
    human1.name = "Anwar"
    human1.printName()

    val fruits1= Fruits(name = "Manago", type = 1)
    val fruits2= Fruits(name = "Manago")
    fruits1.printName()
    fruits2.printName()

    val company = Company("Firoz","anwar",true)
    println(company.fName)
    println(company.fullName)
    company.fullName = "Rahul Gupta"
    println(company.fullName)
}

class HUman{
    var name: String = ""

    fun printName(){
        println(name)
    }
}

// Primary constructor with default constructor param
class Fruits(val name: String,val type:Int = 8){
    fun printName(){
        println("$name : $type")
    }
}

// Multiple Constructors in a Kotlin Class
class Company(val firstName:String, val lastName: String, val isPlatinum: Boolean){

    // Class Properties
    val fName = "$firstName"

    // Override Property Getters in Kotlin
    var fullName = "$firstName $lastName"
    get() = "Full Name is $field"
    set(value) {
        field = "Rahul"
    }

    // Init block is called after the primary constructor
    init {
        println("init 1 block is called")
    }

    init {
        println("init 2 block is called")
    }

    constructor( firstName:String,  lastName: String) : this(firstName,lastName, false){
        println("Secondary constructor called")
    }

    constructor( firstName:String) : this(firstName,"Unknown"){
        println("Third constructor called")
    }
}