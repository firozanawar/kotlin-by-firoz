package inheritances

fun main(args: Array<String>) {
    var dog = Dog();
    println(dog.eat())
    println(dog.color)

}

open class Animal {
    open var color: String = "white"
    open fun eat() {
        println("Animal is eat")
    }
}

class Dog : Animal() {
    var breed: String = ""
    override var color: String = "black"

    fun Bark() {
        println("bark")
    }

    override fun eat() {
        super<Animal>.eat()
        println("Dog is eat")
    }
}

class Cat : Animal() {
    var age: Int = -1

    fun meow() {
        println("meow")
    }
}