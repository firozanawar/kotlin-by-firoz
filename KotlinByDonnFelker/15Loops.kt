package KotlinByDonnFelker

fun main() {

    println("Normal for loop")
    for (i in 1..10) {
        print("${i} ")
    }

    println("")
    println("Step")
    for (i in 1..10 step 2) {
        print("${i} ")
    }

    println("")
    println("Until")
    for (i in 1 until 10) {
        print("${i} ")
    }

    println("")
    println("downTo")
    for (i in 10 downTo 1) {
        print("${i} ")
    }

    // While and do-while is same as other language like Java
    // Break and continue is same as other language like Java
    // In kotlin we have labeled loop¬¬
}