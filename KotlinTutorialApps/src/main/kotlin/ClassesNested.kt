fun main() {
    val obj = Outer.nested()
    print(obj.foo())
}
class Outer{
    class nested {
        fun foo() = "this is my text "
    }
}