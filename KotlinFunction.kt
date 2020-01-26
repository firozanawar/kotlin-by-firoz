@file:JvmName("MyCustomClassName")

fun main(args: Array<String>) {
    var result = max(4, 6)
    println("Max value is $result")
}

//@JvmOverloads
fun max(a: Int, b: Int): Int = if (a > b) {
    a
} else {
    b
    48
}
