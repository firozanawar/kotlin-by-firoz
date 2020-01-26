package scopefun

class Person(val firstName: String, val secondName: String) {
    var address: String = "Unknown"
    fun getInfo() = "first name = $firstName last name=$secondName address=$address"
}

fun main() {
    var person = Person("Firoz","Anwar")
    person.address = "Delhi"
    println(person.getInfo())

    // OR the above statement can also be written as below
    var per = Person("Firoz","Anwar").run {
        address = "UP"
        getInfo()
    }
    println(per)
}