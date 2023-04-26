fun main() {
    var fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    val result = fruits.drop(1)
        //cheking if array is empty
    println( "Array is empty : " + fruits.isEmpty())

    //starting 1 element dropped
    for(items in result)
    {
        println(items)
    }
}


