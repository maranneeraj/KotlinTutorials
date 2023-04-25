fun main(args: Array<String>) {
    val escapedString : String  = "I am escaped String!\n"
    var rawString :String  = """This is going to be a
   multi-line string and will
   not have any escape sequence""";

    print(escapedString)
    println(rawString.toUpperCase())
}