class persons ( val _name : String , val _age : Int = 26)  //constructor with default value of age
{
    var name: String
    var age: Int
    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main() {
    val Person = persons("Neeraj" , 33)
    val Person2 = persons("Ritu")
}