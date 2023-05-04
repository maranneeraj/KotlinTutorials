fun main(){
  var obj = BCDE()
  obj.think()
}

open class ABCD {
    open fun think(){
        println("Hey ! I am thinking")
    }
}
class BCDE : ABCD(){
    override fun think(){
        println("I am child function")
    }
}