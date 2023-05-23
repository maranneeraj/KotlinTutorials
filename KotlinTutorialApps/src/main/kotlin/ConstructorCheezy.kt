fun main() {
    var car = Automobile("car", 4 , 5, true)


    var person = Personn("Neeraj", 33)
    // person.name = "hello"   //can change name here only if we declare var in function/constructor
    println(person.name)
    println(person.age)

    var person2 = Personn("Ritu", 27)
    println(person2.name)
    println(person2.age)
}

class Automobile ( val name : String, val tyres : Int, val maxSeating : Int, hasAirBags : Boolean) //hasAirBags will behave as parameter not property
    {
    var airBags = hasAirBags        //now we can use hasAirBags as property
    fun drive(){}
        fun applyBrakes(){}
}
class Empty{

}
class Personn(nameParan : String, ageParam:Int) // <- this is called primary constructor
{
    val name : String = nameParan
    val age : Int = ageParam
    var canVote : Boolean = ageParam>18

}