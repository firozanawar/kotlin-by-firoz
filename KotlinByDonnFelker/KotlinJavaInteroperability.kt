//@file:JvmName("MyCustomKotlinFilName")
package KotlinByDonnFelker

fun main() {

    // Access java method
    var area = JavaKotlinInteroperability.area(4, 5)
    println(area)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}