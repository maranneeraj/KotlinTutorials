fun main() {
    val fruits = listOf("banana","pineapple", "avocado", "zen","apple", "kiwifruit")
    val niew = listOf(10,55,54,54,7,65,89,7,7,78)
    fruits
       // .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
       // .forEach { println(it) }
    niew
        .sortedBy { it }
        .forEach{print(" " +it)}
}