package KotlinByDonnFelker

fun main() {

    var name = "Firoz Anwar"  // Mutable variable
    var fullNameAddress = "My name is Firoz Anwar \nMadapur Chawni \nGhosi Mau"
    println(fullNameAddress)
    println()

    fullNameAddress = """
        My name is Firoz Anwar 
        Madapur Chawni 
        Ghosi Mau
    """.trimIndent()
    println(fullNameAddress)
    println()

    fullNameAddress = """
        My name is Firoz Anwar 
        Madapur Chawni 
        Ghosi Mau
    """.replaceIndent("-|-")
    println(fullNameAddress)
    println()

    fullNameAddress = """
        My name is Firoz Anwar 
        Madapur Chawni 
        Ghosi Mau
    """.trimMargin()
    println(fullNameAddress)

    var fName = "Firoz"
    var lName = "Anwar"
    println("My name is $fName and last name is ${lName.length} ")

    // Boolean
    println("".isBlank())
    println("".isBlank().not())

    // Try REPL to write and run program directly.
}