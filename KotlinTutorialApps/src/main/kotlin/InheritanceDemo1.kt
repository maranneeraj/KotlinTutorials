
fun main(){
    val a = InheritanceDemo1()
    a.think()
    a.talking()
}
class InheritanceDemo1 : ABC()  //inheritance using Default constructor
{
    fun talking(){
        println("I am talking")
    }
}
open class ABC {
    fun think(){
        println("Hey !! I am thinking")
    }
}