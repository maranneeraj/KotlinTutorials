fun main() {
    val a : Long = 15
    val result = factorial(a)
    println(result)
}
fun factorial(a : Long) :  Long {
    val result : Long
    if(a<=1){
        result = a
    }
    else
    {  result = a*factorial(a-1)    }
    return result
}