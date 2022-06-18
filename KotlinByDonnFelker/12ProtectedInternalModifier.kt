package KotlinByDonnFelker

fun main() {

    val p1 = MyPerson("Firoz")

    // Since favoriteFood is protected, it can't be set from outside.
    //p1.favoriteFood = "rice"

    val c1 = Chef("anwar", "roti")
    c1.printFood()
    c1.printMyFavFood()
}

open class MyPerson(name: String) {

    protected var favoriteFood: String = "Unknown"

    fun printMyFavFood(){
        println(favoriteFood)
    }
}

class Chef(name: String, favFood: String) : MyPerson(name) {

    // protected property can be access via inherited class.
    init {
        favoriteFood = favFood
    }

    protected fun printName(){
        println("My fav food")
    }

    fun printFood() {
        println(favoriteFood)
    }
}