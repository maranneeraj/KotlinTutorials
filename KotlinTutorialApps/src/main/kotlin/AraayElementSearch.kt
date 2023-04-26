fun main(args: Array<String>) {
    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
  //  fruits.set(1,"Kiwi")
    if ("Mango" in fruits){
        println( "Mango exists in fruits" )
    }else{
        println( "Mango does not exist in fruits" )
    }

}