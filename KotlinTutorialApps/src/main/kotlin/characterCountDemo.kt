fun main() {
    var count = 1
    var count1 = 1
    var name = "Neeraj maran neeru"

    //string.getOrNull returns null when string array reaches outOfBound
    // i.e. beyond last element of string array

    while (name.getOrNull(count)!=null)
    {
        if(name[count] == ' ') {
            count++
           continue
        }
        count1++
        count++
        }
    println("Number of characters in name = " +count1)

}