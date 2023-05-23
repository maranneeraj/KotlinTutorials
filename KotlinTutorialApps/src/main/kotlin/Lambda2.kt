

fun main () {
    val funcMultiply : (Int, Int)->Int = {a: Int, b:Int -> a*b}
    val testVar = (funcMultiply (4, 3))
    println(testVar)

    val funcSayHi : (String) ->Unit= {
        name: String ->
        println("Hi $name")
    }
    funcSayHi ("Lambda")
}

//fun main (args: Array<String>) {
//    val funcMultiply - {a: Int, b: Int -> a*b}
//    println (funcMultiply (4, 3))
//    val funcSayHi - {name: String -> println ("Hi $name") }
//    funcSayHi("John")
//}

