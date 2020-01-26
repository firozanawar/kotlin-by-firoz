package scopefun

fun main() {

    val numbers = mutableListOf("One", "Two", "three", "four", "five")
    val result = numbers
        .map { it.length }
        .filter { it > 3 }
    //println(result)

    // OR the above statement can also be written as below
    val mapppedresult = numbers
        .map { it.length }
        .also {
            print(it)
        }
        .filter { it > 3 }
    println(mapppedresult)


}