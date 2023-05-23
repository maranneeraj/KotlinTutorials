fun main() {
    var fn : (a: Int , b: Int) -> Int = :: Sum

    val lambda1 = {x:Int, y:Int -> x+y}

    val multiLineLambda = {
        println("Hello lambda")
        val a = 2+3
         "hello Chese"
    }
    multiLineLambda()
    //println(multiLineLambda())
}

fun Sum(a:Int, b:Int): Int = a+b
