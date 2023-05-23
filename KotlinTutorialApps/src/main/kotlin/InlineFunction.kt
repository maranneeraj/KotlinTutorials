fun main() {
    println(summ(10,20))  // 10 & 20 are arguments
    println(sum2(20,20))
    println(sum3(30,20))
    var sumfun = ::summ //function stored in variable
    println(sumfun(1,2))
}
fun summ(a:Int, b:Int) : Int    //a & b are parameters
{
    return a+b

}
// this inline (single line) function works same as the above function
fun sum2(a: Int, b: Int) : Int = a+b
fun sum3(a: Int, b: Int) = a+b