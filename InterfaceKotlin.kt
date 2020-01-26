import inheritances.Dog

fun main(args: Array<String>) {

    var button = Button()
    button.onClick()
    button.onTouch()

}

interface MyInterfaceListener {

    var name: String

    fun onTouch(){
        println("onClick in MyInterfaceListener")
    }

    fun onClick() {
        println("onClick in SecInterfaceListener")
    }

}

interface SecInterfaceListener {

    var name: String

    fun onTouch(){
        println("onClick in SecInterfaceListener")
    }

    fun onClick()

}

class Button : MyInterfaceListener, SecInterfaceListener {

    override var name: String = "Dummy"
    override fun onTouch() {
        super<MyInterfaceListener>.onTouch()
        super<SecInterfaceListener>.onTouch()
        println("onTouch in Button")
    }

    override fun onClick() {
        super.onClick()
        println("onClick in Button")
    }
}