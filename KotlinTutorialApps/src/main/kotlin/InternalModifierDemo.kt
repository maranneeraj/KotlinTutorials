open class ABCDZ(){
    internal val i = 1      //can be accessed from inside the same module
    internal fun doSomething(){
        println("we are inside doSomething function")
        println("The value of i = $i")
    }
}
class BCDEZ : ABCDZ(){
    fun printValues(){
        doSomething()
        println("The value of i = $i")
    }
}
fun main() {
    val a = ABCDZ()
    val b = BCDEZ()
    b.printValues()
    a.doSomething()
}
