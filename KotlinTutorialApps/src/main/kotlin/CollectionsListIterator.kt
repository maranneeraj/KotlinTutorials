fun main() {
    val theList = listOf("One","Two","Three", "Four")
    val itr = theList.listIterator()
    while(itr.hasNext())
        println(itr.next())
}