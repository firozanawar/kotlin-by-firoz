package KotlinByDonnFelker

fun main() {

    val name = "firoz"

    // This also can return something
    when (name) {
        "firoz" -> println("Its firoz")
        "anwar" -> println("Its anwar")
        else -> println("Its anwar")
    }

    // When as a expression
    val result = when (name) {
        "firoz" -> "Its firoz"
        "anwar" -> "Its anwar"
        else -> "Its anwar"
    }
    println(result)

    // Ranges in when clause
    val x = 11
    when (x) {
        in 1..20 -> println("found")
        else -> println("not found")
    }
}