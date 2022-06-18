package KotlinByDonnFelker

fun main(){

    // Companion object's function call me called directly without creating class object.
    MyCompanionObject.printlist()

    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.printNmae()

    println(FavoriteFood.MAX_AGE)
}

class MyCompanionObject{

    // Kotlin Companion Objects
    companion object{

        // Constants in Kotlin
        private const val MAX_AGE = 10

        fun printlist(){
            for (i in 0..5){
                println(i)
            }
        }
    }
}

object FavoriteFood{
    // Constants in Kotlin
    const val MAX_AGE = 10

    var name = "Unknown"

    fun printNmae(){
        println("Frute is $name")
    }
}