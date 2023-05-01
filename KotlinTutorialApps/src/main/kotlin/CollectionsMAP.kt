fun main() {
    val theMap = mapOf("One" to 1,"Two" to 2,"Three" to 3, "Four" to 4)
    print("The Map of : ")
    println(theMap)
    println("The Entries are " +theMap.entries)
    println("The Keys are : " +theMap.keys)
    println("The Values are : " +theMap.values)

    val theMutableMap = mutableSetOf("One" to 1,"Two" to 2,"Three" to 3, "Four" to 4)
    print("The Mutable Map of : ")
    println(theMutableMap)

    val theHashMap = HashMap<String, Int>()
    theHashMap["One"] = 1
    theHashMap["Two"] = 2
    theHashMap["Three"] = 3
    theHashMap["Four"] = 4

    print("The Hash Map of : ")
    println(theHashMap)
}