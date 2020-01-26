package scopefun

fun main() {

    val numbers = mutableListOf("One", "Two", "three", "four", "five")
    val result = numbers
        .map { it.length }
        .filter { it > 3 }
    println(result)

    // OR the above statement can also be written as below
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    var nullableString: String? = "null"
    nullableString?.let {
        print(it)
    }
}