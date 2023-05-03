class person ( val _name : String , val _age : Int) {
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
    val Person = person("Neeraj" , 33)
}