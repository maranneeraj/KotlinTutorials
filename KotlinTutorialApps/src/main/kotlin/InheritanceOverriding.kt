fun main(){
  var obj = BCDE()
  obj.think()
}

open class ABCD {       // super class of BCDE
    open fun think(){
        println("Hey ! I am thinking")
    }
}
class BCDE : ABCD(){    //sub-class of ABCD
    override fun think(){
        println("I am child function")
    }
}