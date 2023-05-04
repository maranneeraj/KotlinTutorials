class myClass{
    private var name = "This is my text"
    fun printText(){
        println(name)
    }
}
fun main(){
    var object1 = myClass()    //this () after the class name while creating object calls the default constructor 
    object1.printText()
}