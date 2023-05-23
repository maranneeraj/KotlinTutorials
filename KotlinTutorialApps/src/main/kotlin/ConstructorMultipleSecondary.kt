class Person3 {
    //Member Variables
    var name: String
    var age: Int
    var salary: Double
    var post : String

    //First Secondary Constructor
    constructor(_name : String, _age : Int, _post: String){
        this.name = _name
        this.age = _age
        this.salary = 42500.00
        this.post = _post
        println("\nFirst Secondary Constructor")
        println("name = $name")
        println("age = $age")
        println("Salary = $salary")
        println("Post = $post")
    }
//Second Secondary Constructor
    constructor(_name : String, _age : Int, _salary : Double, _post: String){
        this.name = _name
        this.age = _age
        this.salary = _salary
        this.post = _post
        println("\nSecond Secondary Constructor ")
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
        println("Post = $post")
    }
    constructor(_name : String, _age : Int) : this(_name,_age, _salary = 50000.0, _post = "manager")

}
fun main() {
    val neeraj = Person3("Neeraj", 33)
    val varul = Person3("Varun", 31, "Deputy Manager")
    val ritu = Person3("Ritu", 26, 40000.00, "IAS")
}