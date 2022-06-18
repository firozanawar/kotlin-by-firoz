package KotlinByDonnFelker

fun main() {
    var name: String = "Firoz"
    // name = null  // Not possible because name is not nullable
    val lenght = name.length

    var name2: String? = "Firoz"
    name2 = null
    val lenght2 = name2?.length // ?. is added that is call safe call operator. // o/p -> null or 5
    // So if name2 is null then lenght2 will be null
    // if name2 is not null then lenght2 will give the length

    val length3 = if (name2 != null) name.length else 0
    // Simplified version
    val length4 = name2?.length ?: 0  // ?: elvis operator
    println(length4)
}