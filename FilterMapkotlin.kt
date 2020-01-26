fun main(args: Array<String>) {


    var list = listOf<Int>(2, 3, 5, 6, 11, 33, 67)

    var newNums = list.filter { it < 10 }
    for (element in newNums)
        println(element)

    var num = list.map { it * it }
    for (element in num)
        println(element)

    var smalSquare = list.filter { it < 10 }
        .map { it * it }
    for (element in smalSquare)
        println(element)
}