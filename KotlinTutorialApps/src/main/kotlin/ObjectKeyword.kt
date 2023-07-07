fun main() {
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.display()
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.incrementfbrlikes()
    SharingWidget.display()

//    print(Aobj.num)
//    Bobj.test()
}

object SharingWidget{
    private var twitterlikes = 0
    private var fblikes = 0

    fun incrementtwitterlikes() = twitterlikes++
    fun incrementfbrlikes() = fblikes++
    fun display() = println(" Facebook - $fblikes \n Twitter - $twitterlikes")
}


//object Aobj{
//    val num:Int =20
//}
//object Bobj{
//    val g = 30
//    fun test(){
//        println("I am an object")
//    }
//}