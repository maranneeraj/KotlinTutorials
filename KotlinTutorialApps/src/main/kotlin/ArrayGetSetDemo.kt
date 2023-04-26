fun main(args: Array<String>) {
    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")

    println( fruits.get(0))
    println( fruits.get(3))

    // Set the value at 3rd index
    fruits.set(3, "Guava")
    println( fruits.get(3))
    println("Size of array is : " +fruits.size)
}