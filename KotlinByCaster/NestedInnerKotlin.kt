package KotlinByCaster

fun main() {

    /** Nested calsses */
    val obj = Vehicle.Gear()
    obj.info()

    /** Inner classes  */
    val myCar = Vehicle()
    val myObj = myCar.StreeringWheel()
    myObj.info()
}

class Vehicle {
    var brand: String = "Fiat"

    class Gear {
        val name: String = "Unknown"
        fun info() = println(name)
    }


    inner class StreeringWheel() {
        val name: String = "My Wheel"
        fun info() = println("$brand $name")
    }
}