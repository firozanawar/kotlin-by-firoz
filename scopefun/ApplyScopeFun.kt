package scopefun

class PersonClass(val firstName: String, val secondName: String) {
    var address: String = "Unknown"
    var phoneNo: String = "Unknown"
    fun getInfo() = "first name = $firstName last name=$secondName address=$address"

    override fun toString(): String {
        return "$firstName $secondName $address $phoneNo"
    }
}

fun main() {
    val person = PersonClass("Firoz","Anwar")
    person.address = "delhi"
    person.phoneNo = "123"
    println(person)

    // OR the above statement can also be written as below
    val personNew = PersonClass("Firoz","Anwar").apply {
        address = "delhi"
        phoneNo = "123"
        getInfo() // This call doesn't matter,
    }
    println(personNew.toString())
}