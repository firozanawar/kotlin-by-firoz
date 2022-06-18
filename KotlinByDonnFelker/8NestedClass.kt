package KotlinByDonnFelker

fun main(){
    val sw = Vehicle.SterringWheel()
    sw.info()

    val vhicle: Vehicle = Vehicle()
    val ts = vhicle.Transmission()
    ts.gear()
}

class Vehicle{

    val brand: String = "Unknown"

    class SterringWheel{
        val type = "automatic"
        fun info() = println("Type is $type")
    }

    // Here brand member is not accessible directly.
    // To use outer class member inside the inner class, class should be declared as inner
    inner class Transmission(){
        val shift = "cool"
        fun gear() = println("Brand is $brand")
    }
}