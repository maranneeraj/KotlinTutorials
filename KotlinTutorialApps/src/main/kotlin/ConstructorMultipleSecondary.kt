class Person3 {
    //Member Variables
    var name: String
    var age: Int
    var salary: Double
//First Secondary Constructor
    constructor(_name : String, _age : Int){
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("\nFirst Secondary Constructor")
        println("name = $name")
        println("age = $age")
    }
//Second Secondary Constructor
    constructor(_name : String, _age : Int, _salary : Double){
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("\nSecond Secondary Constructor ")
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}
fun main() {
    val neeraj = Person3("Neeraj", 33)
    val ritu = Person3("Ritu", 26, 40000.00)
}