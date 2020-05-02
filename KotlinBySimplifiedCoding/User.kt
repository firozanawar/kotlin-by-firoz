package KotlinBySimplifiedCoding


data class User(val username: String, val password: String)

fun getUser(): User {
    return User("firoz", "123")
}

fun main(args: Array<String>) {

    val (username, password) = getUser()
    println("Username is -> $username and password is -> $password")
}