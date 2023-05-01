fun main() {
    val day = 7
    when(day){
        in 1..5->
        {
            println("Weekday")
            println("Enjoy your work")

        }
        in 6..7 -> {
            println("Weekend")
            println("Enjoy your weekend")
        }
        in 8..1000 -> print("Invalid days")
        else -> println("Out of range")
    }
}