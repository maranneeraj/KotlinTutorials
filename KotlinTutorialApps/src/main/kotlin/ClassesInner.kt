fun main() {
    val obj = Outers().Inner()
    print(obj.foo())
}
class Outers{
    private val welcomeMessege = "Welcome to inner outer program"
    inner class Inner{
        fun foo() = welcomeMessege
    }
}