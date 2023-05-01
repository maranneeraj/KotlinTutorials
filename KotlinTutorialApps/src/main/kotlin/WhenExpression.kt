fun main() {
    val day = 5
    //when works similar to switch case
    val result = when (day){
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid Day"
    }
    println(result)
}