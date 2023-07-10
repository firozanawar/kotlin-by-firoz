package KotlinByDonnFelker

fun main() {

    val x: Int = 6
    val y: Int = 16
    println(x greaterValue y)
}

infix fun Int.greaterValue(value: Int): Int {
    if (this > value) return this
    else return value
}