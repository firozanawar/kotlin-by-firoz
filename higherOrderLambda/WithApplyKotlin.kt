package higherOrderLambda

fun main(args: Array<String>){

    var withApplyObj = WithApply()
    withApplyObj.name = "Firoz"
    withApplyObj.age = 32

    // Due to calling withApplyObj. again and again we can write this as follow..
    with(withApplyObj){
        name = "Firoz"
        age = 32
    }

    println(withApplyObj.name)
    println(withApplyObj.age)

    // The difference between with and apply is apply return values and also we can call method but in case of with we don't
    withApplyObj.apply {
        name = "Anwar"
        age = 33
    }.startRun()

    println(withApplyObj.name)
    println(withApplyObj.age)
}

class WithApply{
    var name: String  = ""
    var age: Int = 0

    fun startRun(){
        println("I am ready to run")
    }
}