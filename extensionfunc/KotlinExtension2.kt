package extensionfunc

fun main(args: Array<String>) {

    var str: String = "Hey "

    println(str.add("Firoz ", "Anwar"))

    var x: Int = 6
    var y: Int = 8
    println(30.max(4))

}

fun String.add(str1: String, str2: String): String {
    return this + str1 + str2
}

fun Int.max(other: Int): Int {
    return if (this > other) this else other
}