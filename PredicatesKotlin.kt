fun main(args: Array<String>) {


    var list = listOf<Int>(2, 3, 5, 6, 11, 33, 67)

    var check1 = list.all { it > 10 }
    println(check1)

    var check2 = list.any { it > 10 }
    println(check2)

    var check3 = list.count { it > 10 }
    println(check3)

    var check4 = list.find { it > 10 }      //  Return the first number
    println(check4)

    val myPredicate = { num: Int -> num < 10 }
    var check5 = list.all (myPredicate) // any, count, find can be used here
    println(check5)

}

class Peroson{
    lateinit var name: String

    fun setup(){
        name = "Firoz"
        println(name)
    }
}