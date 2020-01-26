fun main(args: Array<String>) {

    CustomerData.score = 90
    CustomerData.typeOFcustomer()
    println(CustomerData.score)
    println(CustomerData.typeOFcustomer())

    println(CustomerData.somemthod("FIROX"))
}

open class MyParent() {

    open fun somemthod(str: String) {
        println("Hello in MyParent")
    }
}

object CustomerData : MyParent() {

    var score: Int = -1
    fun typeOFcustomer(): String {
        return "Indian"
    }

    override fun somemthod(str: String) {
        super.somemthod(str)
        println("Hello in CustomerData")
    }
}