package KotlinBySimplifiedCoding

import java.util.*

fun main(args: Array<String>) {

    println("Hello World");

    /********** Variables, Constants **********/
    var a = 10;
    a = 20;
    println("Value of a is ${a}")

    var name: String = "Firoz Anwar"
    println("My name is: ${name}")

    val b = 30;
    //b = 40   // Can't do this

    /********** If, else **********/
    val c = 10;
    val d = 20;
    val largest = if (c > d) {
        println("${c} is larger")
        c
    } else {
        println("${d} is larger")
        d
    }
    println("final largest is ${largest}")

    /********** when (switch in java) **********/
    when (c) {
        10 -> println("Matched with 10")
        in 1..10 -> println("It is from 1 to 10")
        20 -> println("Matched with 20")
    }

    /********** loops **********/
    for (i in 1..10)
        print("${i} ")

    println()
    var x = 1
    while (x <= 10) {
        print("${x} ")
        x++
    }

    println()
    var y = 1
    do {
        print("${y} ")
        y++
    } while (y <= 10)
    println()

    /********** Arrays **********/
    var arr = arrayOf(1, 2, 3, 4, 5, 6.5, false, "Firoz")

    // Specific data type base Array like interger array
    //var arr = arrayOf<Int>(1, 2, 3, 4, 5)
    println(arr[0])

    for (x in arr)
        print("${x} ")

    println()
    // 2D array
    var arr1 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(1, 2, 3),
        arrayOf(1, 2, 3)
    )

    for (i in arr1) {
        for (j in i) {
            print(j)
        }
        println()
    }

    /********** Lists **********/
    var users = listOf<String>(
        "Firoz",
        "Inzima",
        "Rahul",
        "Visjal"
    )

    for (name in users)
        println(name)

    for ((index, name) in users.withIndex())
        println("at $index name is $name")

    /********** Maps **********/
    var userMap = TreeMap<String, String>()
    userMap["username"] = "firoz123"
    userMap["passowrd"] = "123456"

    for ((key, value) in userMap)
        println("$key -> $value")

    /********** Default and named parameters **********/
    fun function1(name: String = "firoz", email:String){
        println("name is $name")
        println("email is $email")
    }

    function1(email = "firoz@gmail.com")
    function1(email = "firoz@gmail.com",name = "Khan")

    /********** try catch finally exception is same as java in kotlin **********/
    // The only difference is try catch can be used as an expression.

}