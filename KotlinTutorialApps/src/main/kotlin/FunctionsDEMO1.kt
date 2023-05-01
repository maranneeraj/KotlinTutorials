fun main(){
    val a=10
    val b=24
    printHello()
    val result = printSum(a,b)
    println("Printing result with returning values = $result")
}
fun printHello(){
    println("Hello Neeraj ! I am custom function")
}
fun printSum(a:Int,b : Int) : Int
{
    println("Sum of the two numbers in User Defined function : " +(a+b))
    return (a+b)
}