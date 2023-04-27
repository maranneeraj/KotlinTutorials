fun main() {
    higherOrder(2.0,3.0, ::add)

    val myFun = higherOrder(10.2,3.8,::add)
    println(myFun)

}
fun add (a:Double, b:Double) : Double {
    return  a+b;
}

fun higherOrder(a:Double, b:Double, fn:(Double,Double) -> Double): Double {
    println(fn(a,b))
    return(fn(a,b))
}