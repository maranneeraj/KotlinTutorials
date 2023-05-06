open class ABCDE{
    open val count : Int = 0
    open fun think(){
        println("Hey !! I am thinking")
    }
}
class BCDEF : ABCDE(){
    override val count: Int     //overriding variable of super class ABCDE
    init {
        count = 100
    }
    override fun think() {      //overriding function of super class ABCDE
    println("I am from CHILD")
    }
    fun displayCount()
    {
        println("Count value is $count")
    }
}
fun main()
{
    var a  = BCDEF()
    a.think()
    a.displayCount()
}