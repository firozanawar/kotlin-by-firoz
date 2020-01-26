package constructor

fun main(args: Array<String>) {
    var person = Person("Firoz",10);

    println("My name is ${person.name}")
    println(person.id)
}

// by declaring var, or val in constructor we can use it as property/filed value.
class Person(var name: String) {
    var id: Int = -1;

    init {
        println("name is $name")
    }

    constructor(n: String, age: Int) : this(n) {
        this.id = age
    }
}