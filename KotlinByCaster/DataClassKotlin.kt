package KotlinByCaster

fun main() {

    val e1 = Employee("Firoz", "Anwar")
    val e2 = Employee("Firoz", "Anwar")

    // Without data class // -> false
    // With data class    // -> true, because equals, hashcode and toString applies in data class
    println(e1 == e2)
    println(e1)

    /** kotlin-data-class-component1-component2-component */
    println(e1.component1())  // -> Firoz
    println(e1.component2())  // -> Anwar

    /** kotlin-data-class-destructuring */
    val (firstName, lastName) = e1
    // val (component1, component2, ... , ..., ... )  = object
    println(firstName)  // -> Firoz
    println(lastName)   // -> Anwar

    /** copying-kotlin-data-classes */
    val sibling = e1.copy()

    // Changing the property
    val sibling1 = e1.copy(firstName = "Khan")
    println(sibling)
    println(sibling1)

    /** kotlin-pair-and-triple-data-classes */
    //val pair = Pair("foo", "bar")
    // or
    val pair = "foo" to "bar"
    println(pair.first)
    println(pair.second)

    val triple = Triple("Hi", "Bye", 10)
    println(triple.first)
    println(triple.second)
    println(triple.third)
}

/**
 * Note - If you want parameter less data class provide the default value for
 */
data class Employee(val firstName: String, val lastName: String)