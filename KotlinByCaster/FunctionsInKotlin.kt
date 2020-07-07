package KotlinByCaster

fun main() {
    val x = myFun()
    println(x)

    sayHiAndBye()

    doWork()

    // Press Alt+Enter for options
    printUserInfo(
        firstName = "Firoz",
        lastName = "Anwar",
        age = 31,
        isSunBurned = false,
        likeMovies = true,
        lovPopcorn = true
    )

    printBookInfoTitle("My Book", "Author1", "Author2", "Author3", "Author4", "Author5")
    /**
     * O/p -
     *  Title is My Book and Authors:
        Author1
        Author2
        Author3
        Author4
        Author5
     */
}

/** create-a-function-in-kotlin */
fun myFun() {
    println("Hello World")
}

/** /kotlin-functions-inside-of-other-functions */
fun sayHiAndBye() {
    println("Hi")

    fun sayBye() {
        println("Bye")
    }
    sayBye()
}

/** kotlin-single-line-expressions */
fun singleLineFun() = println("Hi From singleLineFun ")
val age = 12
fun doWork() = if (age > 10) println("Cool") else println("bad")

/** kotlin-function-arguments and kotlin-named-parameters */
// Press Alt+Enter for options
fun printUserInfo(
    firstName: String,
    lastName: String,
    age: Int,
    isSunBurned: Boolean,
    likeMovies: Boolean,
    lovPopcorn: Boolean
) {
    println("Hi")
}

/** kotlin-varargs-providing-multiple-arguments-of-the-same-type */
// Let us suppose you have a function which can take one parameter, 2 also. 3 also...n also we can use vararg to get it as a string.
fun printBookInfoTitle(title: String, vararg authors: String) {
    println("Title is $title and Authors: ")
    authors.forEach { println(it) }
}

/** kotlin-function-overloading */


