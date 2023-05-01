fun main() {
    val result = calculate(14,5, ::sum)
    println("The result of Sum is : $result")
}
fun sum(a:Int, b:Int) = a+b
fun calculate(a:Int, b:Int, operation:(Int, Int) -> Int) : Int {
    return operation(a,b)
}