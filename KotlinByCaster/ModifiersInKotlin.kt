package KotlinByCaster

fun main() {

    val p1 = Food();
    //println(p1.myFood)

    val c1 = Ribs()
    c1.setMyFoods("Biryani")
    println(c1.getMyFoods())

    //p1.printMyFavFood() // -> not accessible
}

open class Food {
    //protected val myfood: String = "Unknown"  // -> Can't be access to main() because protected.
    protected var myFood: String = "Unknown"

    fun info(){
        myFood = "Chana"
        println("HI")

        printMyFavFood()
    }

    protected fun printMyFavFood(){
        println("Food is $myFood")
    }
}

class Ribs : Food() {

    init {
        myFood = "Chicken"
    }

    fun setMyFoods(value: String){
        myFood = value
        printMyFavFood()
    }

    fun getMyFoods(): String{
        return myFood
    }

}