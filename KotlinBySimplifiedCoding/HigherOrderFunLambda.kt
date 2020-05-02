package KotlinBySimplifiedCoding

fun makeHer0(realName: String, heroName: String, make: (String, String) -> String) {

    val result = make(realName, heroName)
    println(result)
}

fun main(args: Array<String>) {

    // Method-1
    val make: (String, String) -> String = { realname, heroname -> "$realname is now $heroname" }
    makeHer0("Tony", "Iron", make)

    // Method-2
    makeHer0("Tony", "Iron",{
            realname, heroname -> "$realname is now $heroname"
    })

    // Method-3
    makeHer0("Tony", "Iron"){
            realname, heroname -> "$realname is now $heroname"
    }
}