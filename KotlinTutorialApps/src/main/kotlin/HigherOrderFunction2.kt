fun main (args: Array<String>) {
    val funcMultiply : (Int, Int) ->Int = {a: Int, b:Int -> a*b}
    val funcSum : (Int, Int) ->Int = {a: Int, b: Int -> a+b}
    performMath (3, 4, funcMultiply)
    performMath (3, 4, funcSum)
}

fun performMath (a: Int, b:Int, mathFunc : (Int, Int) -> Int) : Unit
{
    println ("Value of calculation: ${mathFunc (a, b) }")
}