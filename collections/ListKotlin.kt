package collections

fun main(arg: Array<String>) {

    var list = listOf<String>("Firoz", "Anwar")  // Immutable, Fixed size, READ only

    for (element in list)
        println(element)

    var mutablelist: MutableList<String> = mutableListOf<String>("Firoz", "Anwar")   // Mutable, no Fixed size, can add or remove
    //var mutablelist = arrayListOf()<String>("Firoz", "Anwar")   // Mutable, no Fixed size, can add or remove
    //var mutablelist = ArrayList<String>("Firoz", "Anwar")   // Mutable, no Fixed size, can add or remove
    mutablelist.add("INZI")

    // or
    mutablelist[1] = "Rahul"
    for (element in mutablelist)
        println(element)

    // removeAt, replaceAll, etc predefined method are avialable.
}