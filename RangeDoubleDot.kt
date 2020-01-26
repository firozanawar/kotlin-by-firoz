fun main(args: Array<String>) {

    var ran1 = 1..5
    var ran2 =  1..10 step 2

    var ran3 = 5 downTo 1
    var ran4 = 5 downTo 1 step 2

    var ran5 = 'a'..'z'
    var isPresent = 'c' in ran5
    println(isPresent)

    var ran6 = 10.downTo(1)
    var ran7 = 1.rangeTo(10)
    println(15 in ran7)  // false
}