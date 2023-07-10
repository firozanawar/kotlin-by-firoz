package KotlinByDonnFelker

fun main() {

    val student = Student()
    val isPassed = student.isPassed(50)
    println(isPassed)

    // Extension function in our own class
    println(student.gotScholer(91))

    // Extension function in pre-defined class
    val str1: String = "Hello "
    val str2: String = "World"
    val str3: String = "Hey "
    println(str3.add(str1, str2))
}

fun String.add(str1: String, str2: String): String {
    return this + str1 + str2
}

fun Student.gotScholer(mark: Int): Boolean {
    return mark > 90
}

class Student {

    fun isPassed(mark: Int): Boolean {
        return mark > 40
    }
}