package KotlinBySimplifiedCoding.constructors

class SecondaryConstructor(username: String) {

    init {
        println("init block executed")
    }

    constructor(id:String, username: String) : this(username){
        println("id in cons is ${id}")
        println("username in cons is ${username}")
    }
}