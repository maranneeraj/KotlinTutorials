fun main()
{
    var p1 = DATAclassDemo("Neeraj", 44601)
    var p2 = DATAclassDemo("Nilesh", 44601)
   // println(p1)
   //  println(p2)
    println(p1==p2)
    println(p1.namesalary())
    println(p2.namesalary())

}
data class DATAclassDemo(val names: String, val salarys:Int) {
    var name = names
    var salary = salarys
    fun namesalary() : String
    {
        return "$name $salary"
    }

}


