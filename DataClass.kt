data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Firoz", 34)
    val person2 = Person("Firoz", 34)

    if (person1 == person2) {
        println("true")
    } else {
        println("false")
    }

    // We can directly print the value.
    println(person1.name)

    // Can't assign the value because constructor has val, if var then it can be assigned.
    // person2.age = 33

    // Values can be access this way also
    println(person1.component1())
    println(person1.component2())

     val (name,age) = person1
    println(name)
    println(age)

    var newObjec = person1.copy(name = "Lokesh")
    println(newObjec)
}