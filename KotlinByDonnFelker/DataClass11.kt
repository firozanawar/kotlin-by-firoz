package KotlinByDonnFelker

fun main() {

    val c1 = Country("India", 91)
    val c2 = Country("India", 91)

    // In case of normal class - without data class keyword
    println(c1 == c2)   // This will give false
    println(c1)        // This will print Hashcode

    // In case of data class - with data class keyword
    println(c1 == c2)   // This will give true
    println(c1)        // This will print Hashcode

    c1.printCountryData()

    // Component1, Component2, ComponentN in a Kotlin Data Class
    // Kotlin class generates the component by default
    println(c2.component1()) // 1st parameter of data class
    println(c2.component2())  // 2nd parameter of data class

    // Destructure a Kotlin Data Class
    val(code , name) = c1 // order changed
//    val(component1 , component2) = c1 // order changed
    println(code) // This will refer to component1 so prints India
    println(name) // This will refer to component2 so prints 91

    // Copy a Kotlin Data Class Instance
    // Copy helps to create a copy of data class with some different value if needed
    val sibling1  = c1.copy()
    println(sibling1)
    val sibling2  = c1.copy(name = "America")
    println(sibling2)

    // Use the Kotlin Pair and Triple Data Classes
    val pair = Pair("foo", "bar")
    // OR val pair = "foo" to "bar"
    println(pair.first)
    println(pair.second)

    val triple = Triple("my","cool","specs")
    println(triple.first)
    println(triple.second)
    println(triple.third)
}

// equal // hashcode // toSting
// To create Parameterless Constructor in a Kotlin Data Class use the paramter with default value.
data class Country(val name: String, val code: Int) {

    // data class can have its own function also.
    fun printCountryData(): String {
        return "$name $code"
    }
}