package collections

fun main(args: Array<String>) {

    // Declaration of array having size 5 and all the values from 0 to 4 is assigned to 0
    var myarrays = Array<Int>(5) { 0 }   // Fixed size
    myarrays[0] = 32
    myarrays[4] = 52

    for (element in myarrays)
        println(element)

    println()
    //OR
    for (index in 0..myarrays.size - 1)
        println(myarrays[index])
}