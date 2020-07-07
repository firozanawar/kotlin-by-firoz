package KotlinByCaster

fun main(){

    println(SingletonInKotlin.name)
}

object SingletonInKotlin {
    var name: String = "Unknown"
}