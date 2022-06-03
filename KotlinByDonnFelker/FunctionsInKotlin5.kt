package KotlinByDonnFelker

fun main() {
    helloWorld()
    helloWorld()

    println(funWithReturn())

    sayHi()

    parameterFun("Firoz")

    // Named Arguments in IntelliJ -> Alt + Enter -> Add name to call arguments
    parameterFun(name = "Firoz")

    // Function Refactoring to New Lines -> Alt + Enter -> Put arguments in seperate lines
    namedFun(
        age = 12,
        name = "Anwar"
    )
    defaultParamFun()

    printBookDetails("Do Epic Shit","Ankur","Warikoo")

    printUserDetails(12)
    printUserDetails(12,"Donn")
}

// Doesn't return anything so Unit.
fun helloWorld() {
    println("Hello World !!")

    // Function inside another function
    println(funWithReturn())
}

fun funWithReturn(): Int {
    return 10;
}

fun random(): String {
    return 32.toString();
}

// In kotlin we can create function inside another function and can call it. like below
fun sayHi(){
    println("Hi !!")

    fun sayBye(){
        println("Bye !!")
    }

    sayBye()
}

// Single Line Expressions in Kotlin
fun sayHiBye() = println("Hi Bye")

// Function Arguments
fun parameterFun(name: String){
    println(name)
}

// Named Parameters in Kotlin Functions
fun namedFun(name: String, age: Int){
    println("Name is $name and Age is $age")
}

fun defaultParamFun(Address: String = "Ghosi"){
    println("Address is $Address ")
}

// Provide Multiple Arguments of the Same Type with vararg
fun printBookDetails(title: String, vararg authors: String){
    println(title)
    authors.forEach { println(it) }
}

// Overload a Function in Kotlin
fun printUserDetails(age:Int){
    println("Age is $age")
}
fun printUserDetails(age:Int,name: String){
    println("Age is $age and name is $name")
}
