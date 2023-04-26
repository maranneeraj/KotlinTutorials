fun main(){
    var fruits = arrayOf("Apple","Orange","Banana","kiwi","Banana","banana")
    var distincts = fruits.distinct()
    for(items in distincts)
    {
        println(items)
    }
}