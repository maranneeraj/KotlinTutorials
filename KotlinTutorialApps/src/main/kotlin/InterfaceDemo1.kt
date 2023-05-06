interface ExampleInterface {
    var myVar : Int //abstract variable
    fun absMethod() : String //abstract method
    fun hello(){
        println("Hello Neeraj")
    }
}
class IntrefaceImp : ExampleInterface{
    override var myVar: Int = 25
      override fun absMethod(): String = "Happy learning"

}
fun main(){
    val obj = IntrefaceImp()
    println("My variable value is = ${obj.myVar}")
    println("Calling hello()")
    obj.hello()

    println ("Message from website : ")
    println(obj.absMethod())

}
