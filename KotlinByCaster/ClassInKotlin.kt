package KotlinByCaster

fun main() {

    val user = User("Firoz", "Anwar")
//    user.firstName = "Firoz"
//    user.lastName = "Anwar"
    user.printName()
    println(user.fullName)

    user.fullName = "firoz anwar khan"
    println(user.fullName)

    val user2 = User("Firoz", "Anwar", true)
    val user3 = User("Firoz")

    val userSngle = User.createUser()
    println(userSngle.lastName)
}

