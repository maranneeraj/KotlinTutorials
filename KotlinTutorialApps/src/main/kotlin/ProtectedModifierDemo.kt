open class ABCZ(){
    protected val i = 1
    protected fun doSomething(){
        println("we are inside doSomething function")
        println("The value of i = $i")
    }
}
class BCDZ : ABCZ(){
    fun printValues(){
        doSomething()
        println("The value of i = $i")
    }
}
fun main() {
    val a = ABCZ()
    val b = BCDZ()
    b.printValues()

    //   a.doSomething() this will produce error as it is declared protected
    //  it can be accessed inside the class itself or in its subclasses only
}
