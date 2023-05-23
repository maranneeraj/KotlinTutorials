fun main() {
    dragObjects(arrayOf(Circles(4.0), Squares(4.0), Triangles(4.0,3.0), Player("Neeraj")))
}
 fun dragObjects(objects : Array<Dragables>)
 {
     for(obj : Dragables in objects){
         obj.drag()
     }
 }
interface Dragables{
     // val dragSpeed : Int
    fun drag()
}

abstract class Shapes : Dragables {
    abstract fun area() : Double

}
class Circles(val radius : Double) : Shapes() {
    override fun area(): Double = Math.PI*radius*radius

    override fun drag() = println("Circle is dragging")

}
class Squares(val side : Double) : Shapes() {
    override fun area(): Double = side*side

    override fun drag() = println("Square is dragging")

}
class Triangles(val base : Double, val height : Double) : Shapes() {
    override fun area(): Double = 0.5*base*height

    override fun drag() = println("Triangle is dragging")

}

class Player(val name: String) : Dragables{
    override fun drag() = println("$name is dragging")
}