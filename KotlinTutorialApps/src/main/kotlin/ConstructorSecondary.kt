class person2
{
    var name: String
    var age: Int
    init {      //Initializer Block
        println("Initializer Block")
    }
    //Secondary Constructor with "constructor" keyword
    constructor(_name : String, _age : Int)
    {
        this.name = _name
        this.age = _age
        println("name =  $name \n age = $age")
    }
}
fun main() {
    val Person = person2("Neeraj" , 33)
    val Person2 = person2("Ritu",26)
}


