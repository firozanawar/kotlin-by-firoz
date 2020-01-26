fun main(args: Array<String>) {

    // Lists
    var mutableList: MutableList<String> = mutableListOf(
        "A", "B"
    )
    mutableList.add("C")
    println(mutableList)

    var immutableList: List<String> = listOf("A", "B")
    // immutableList.add("C")  // not possible
    println(immutableList)

    var newList = immutableList.plus("C")  // plus() creates the new list with existing values
    println(newList)

    // Maps
    var mutableMap: MutableMap<String, String> = mutableMapOf(
        "A" to "a",
        "B" to "b"
    )
    mutableMap.put("C", "c")
    println(mutableMap)

    var hasmap: MutableMap<String, String> = hashMapOf(
        "B" to "b",
        "A" to "a"
    )
    println(hasmap)

    val map: Map<String, String> = mapOf("A" to "a", "B" to "b")
    // map.put("C" to "c")  // cant be done
    val newMap = map.plus(
        "C" to "c"
    )
    println(newMap)
}