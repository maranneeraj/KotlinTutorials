fun main() {
    val obj = outer().Inner()
    print(obj.foo())
}
class outer{
    private val welcomeMessege = "Welcome to inner outer program"
    inner class Inner{
        fun foo() = welcomeMessege
    }
}