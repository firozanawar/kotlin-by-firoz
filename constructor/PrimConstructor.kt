package constructor

fun main(args: Array<String>) {
    var student = Student("Firoz");
    println("My name is ${student.name}")
}

// by declaring var, or val in constructor we can use it as property/filed value.
class Student(var name: String) {
    init {
        println("My name is $name")
    }
}