fun main() {
   // MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()


}
class MyClass{
   companion object MyObject{       //companion object of Myclass - works same as static in java
        fun f(){
            println("Hello I am F from object")
        }
    }
    object AnotherObject{
        fun g(){
            println("Hello I am G from Another Object")
        }
    }
}