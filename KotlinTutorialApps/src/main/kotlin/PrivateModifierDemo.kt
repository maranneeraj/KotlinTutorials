open class AB(){
    private val i = 1
    fun doSomething(){
        println("we are inside doSomething function")
        println("The value of i = $i")
    }
}
class BC : AB(){
    fun printValue(){
        doSomething()
        // println("The value of i = $i") - This line here will produce error b/c i is a //
       //             private variable which cannot be accessed here.                   //
    }
}
fun main() {
    val a = AB()
    val b = BC()
    b.printValue()
}
