fun main() {
    val p1 = Personsn("Neeraj", 21)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    print(p1.name)
}

class Personsn(nameParam:String, ageParam:Int)
{
    var name : String = nameParam
        get() {
         return field.toUpperCase()
        }
    var age: Int = ageParam
        set(value) {
            if(value > 0) {
                field = value
            }
            else {
                println("Not a valid age")
            }
        }

}