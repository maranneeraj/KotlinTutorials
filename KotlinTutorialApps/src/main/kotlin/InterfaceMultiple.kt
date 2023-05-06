interface A{
    fun printMe(){
        println(
            "method of interface A")
    }
    fun helloA()    //abstract method
}
interface B{
    fun helloB() //abstract method
    fun printMeToo(){
        println("method of interface B")
    }
}
class multipleInterfaceExample : A,B {
    override fun helloA() {         //overriding abstract method from A
        println("Hello neeraj from A")
    }

    override fun helloB() {         //overriding abstract method from B
        println("Hello neeraj from B")
    }
}
fun main ()
{
    var obj = multipleInterfaceExample()
    obj.printMeToo()
    obj.printMeToo()
    obj.helloA()
    obj.helloB()

}