package KotlinBySimplifiedCoding

import KotlinBySimplifiedCoding.constructors.PrimaryConstructor
import KotlinBySimplifiedCoding.constructors.SecondaryConstructor

fun main(args: Array<String>) {

    var object1 = ClassesInKotlin();
    object1.nickName = "Firoz Anwar"
    println("Name is ${object1.nickName}");

    println("Square is ${object1.findSquare(5)}")


    var primaryCons = PrimaryConstructor("firoz123", "12345");
    println(primaryCons.userName)
    println(primaryCons.password)

    var secondaryCons = SecondaryConstructor("123", "firoz123");

    /********** Extension Function **********/
    var obj = ExtensionFunction();
    obj.setPower("Hello")
    obj.showPower();

    /********** Infix Function **********/
    // Infix is only used for readability of program and it is only used with extension function and function
    // having only one parameters.
    var infixObj = InfixFunction("Power1");
    //infixObj.addPower("Power2")
    infixObj addPower "Power2"

    /********** Operator oveloaded **********/
    infixObj + "Power2"

    /********** Abstract class **********/
    // Same as java.

    /********** Interface is same like java **********/
    // If there are 2 methods in 2 separate interfaces having same name and signature then implemented class with
    // will override it and call it on object creation, but if you want to call specific method of any one of interface
    // then use super<Interface_Name>.methodsName()
}

infix fun InfixFunction.addPower(newPower: String) {
    powers.add(newPower)

    for (pow in powers) {
        println(pow)
    }
}

operator fun InfixFunction.plus(newPower: String) {
    powers.add(newPower)

    for (pow in powers) {
        println(pow)
    }
}


fun ExtensionFunction.setPower(p: String) {
    power = p
}

fun ExtensionFunction.showPower() {
    println(power)
}