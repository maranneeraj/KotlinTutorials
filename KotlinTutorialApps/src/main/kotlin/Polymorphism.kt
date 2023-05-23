fun main() {
    val circle : Shape =  Circle(4.0)           //type Circle can be used instead of Shape
    val square : Shape = Square(4.0)            //type Square can be used instead of Shape

    /* Reference banaya hai parent (Shape) ka lekin methods child class
        ke use kar rahe hai due to polymorphism */
//    println(circle.area())
//    println(square.area())

    val shapes = arrayOf(Circle(3.0), Triangle(4.0, 3.0), Square(4.0))
    calculateArea(shapes)
}

fun calculateArea(shapes : Array<Shape>){
    for (shape:Shape in shapes) {
        println(shape.area())
    }
}


open class Shape(){
    open fun area() : Double {
        return 0.0
    }
}
class Circle (val radius : Double) : Shape(){
    override fun area() : Double {
        return Math.PI*radius*radius
    }
}
class Square (val side : Double) : Shape(){
    override fun area() : Double {
        return side*side
    }
}

class Triangle(val base:Double, val height:Double): Shape(){
    override fun area() : Double{
        return 0.5*base*height
    }
}