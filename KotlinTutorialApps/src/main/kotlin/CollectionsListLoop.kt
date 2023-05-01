fun main() {
    val theList = listOf("One","Two","Three", "Four")
    for(i in theList.indices)
        println(theList[i])
    println("For each loop used : ")
    theList.forEach {println(it) }
}