package extensionfunc

fun main(args: Array<String>) {

    val std = Student()
    std.pass(30)

    // This is also possible
    std.isGraduate(40)
}

fun Student.isGraduate(a: Int): Boolean {
    return a > 60
}

class Student {

    fun pass(marks: Int): Boolean {
        return marks > 50;
    }
}