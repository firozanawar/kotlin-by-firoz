package KotlinByDonnFelker

fun main() {

    val r1 = 1..5   // This range contains the number 1,2,3,4,5
    val r2 = 5 downTo 1     // This range contains the number 5,4,3,2,1
    val r3 = 5 downTo 1 step 2  // This range contains the number 5,3,1

    val r4 = "a".."z"   // This range contains a to z
    var isPresent = "c" in r4
    println(isPresent)

    // Descending
    val countDown = 10.downTo(1)    // This range contains the number 10,9,,8,.....1
    val moveUp = 10.rangeTo(20)     // This range contains the number 10,11,12...20
    println(countDown)
}