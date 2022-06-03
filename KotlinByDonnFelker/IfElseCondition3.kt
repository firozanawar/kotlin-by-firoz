package KotlinByDonnFelker

fun main() {
    val calories = 2500;
    if (calories > 2000) {
        println("You have consumed all your calories for the day")
    } else if (calories > 1500) {
        println("You have few more calories left to eat")
    } else if (calories > 1200) {
        println("You have some room for snacks")
    } else if (calories > 1000) {
        println("You have plenty of calories left")
    } else {
        println("You still have some calories left")
    }

    val age = 10;
    if (age > 11)
        println("The age is greater than 10")
    println("Hello")

    if (age > 5) println("The age is greater than 5") else println("The age is less than 5")

    val myAge = 32;
    val herAge = 32;

    val myName = "firoz"
    val herName = "Rakhi"
    if (myAge != herAge && myName != herName) {
        println("this is true")
    }else{
        println("false case")
    }

    if (myAge != herAge || myName != herName) {
        println("this is true")
    }else{
        println("false case")
    }

    // Structural Equality
    var name1 = "Donn"
    var name2 = "Tushar"
    println(name1 == name2)
    println(name1.equals(name2))

    // In case of primitives == and === are equal but not for custom object
    var a = 12
    var b = 12
    println(a == b) // true
    println(a === b) // true

    var a1 = Person("Donn")
    var b1 = Person("Donn")
    println(a1 === b1)   // false  // === referencial equalities
    println(a1 !== b1)  // true   // === referencial in-equalities
}

class Person(var_name: String)