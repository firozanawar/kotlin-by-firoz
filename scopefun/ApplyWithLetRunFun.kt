package scopefun

fun main(array: Array<String>) {

    var m = 1
    m = m.also { it + 1 }.also { it + 1 }
    println(m)

    val firstPerson = User(21, "Firoz", "Doctor")
    val secondPerson = User(41, "Inzi", "AndroidDev")

    var str: String? = "null"
    
    var len = str?.let {
        str.length
    } ?: "0"


    // Normal ways without scope function
    val olderPerson = if (firstPerson.age > secondPerson.age) firstPerson else secondPerson
    olderPerson.printPerson()

    // run() calls the specified function and return its result.
    run {
        if (firstPerson.age > secondPerson.age) firstPerson else secondPerson
    }.printPerson()

    // With function did executes some logic and returning string so
    // String's extension function is used to print that String.
    with(firstPerson) {
        age += 1
        "Age is now $age"
    }.println()

    // This run is more consieve with above with()
    // Always use run instead of with()
    firstPerson.run {
        age += 1
        "New Age is now $age"
    }.println()

    firstPerson.let { modifiedpersion ->
        modifiedpersion.age += 1
        "Newo Age is now ${modifiedpersion.age}"
    }.println()


//    secondPerson.age = 1
//    secondPerson.job = "Driver"
    secondPerson.apply {
        age += 1
        job = "Driver"
    }.printPerson()

    secondPerson.also {
        it.age += 1
        it.job = "Youtuber"
    }.printPerson()
}

data class User(var age: Int, var name: String, var job: String) {

    fun printPerson() = println(this.toString());
}

fun String.println() = println(this)