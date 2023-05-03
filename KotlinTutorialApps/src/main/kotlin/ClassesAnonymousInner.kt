fun main() {
    var programmer : Human  = object  : Human
    {
        override fun think() {
            println("This is an example of Anonymous Inner Class through interface")
        }
    }
    programmer.think()

    var newObject = object : Human
    {
        override fun think() {
            println("This is new interface implementation")
        }
    }
    newObject.think()
}
interface Human{
    fun think()
}