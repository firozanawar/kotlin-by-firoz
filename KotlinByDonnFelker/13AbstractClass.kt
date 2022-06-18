package KotlinByDonnFelker

/**
 *      We can’t create an object for abstract class.
 *       All the variables (properties) and member functions of an abstract class are by default non-abstract. So, if we want to override these members in the child class then we need to use open keyword.
 *       If we declare a member function as abstract then we does not need to annotate with open keyword because these are open by default.
 *       An abstract member function doesn’t have a body, and it must be implemented in the derived class.
 *       An abstract class can contain both abstract and non-abstract members
 */
fun main() {
    val car1 = CarSedan("Black",4)
    val car2 = CarHachback("yellow",3)
    car1.drive()

    car2.openDoor()
    car2.drive()
   car2.turnOff()

    // We can have Parent class name in function and sub-class can be passed in it and it will act accordingly.
    driveCar(car1)
    driveCar(car2)
}

abstract class VehicleClass(val color: String, val numberOfWheels: Int) {

    abstract fun drive()

    fun openDoor() {
        println("Door opened")
    }

    fun turnOff() {
        println("Ignition tuned off")
    }
}

class CarSedan(color: String, numberOfWheels: Int) : VehicleClass(color, numberOfWheels){

    override fun drive() {
        println("Sedan Car is driving")
    }
}

class CarHachback(color: String, numberOfWheels: Int) : VehicleClass(color, numberOfWheels){

    override fun drive() {
        println("Hachback Car is driving")
    }
}

fun driveCar(vehicle: VehicleClass){
    vehicle.drive()
}

