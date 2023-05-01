fun main() {
    for (num in 1.rangeTo(100))
        println(num)
    //below code returns same output as above
    for (num in 1..100)
        println(num)

    //skips every second number
    for (num in 1.rangeTo(100) step 2)
        println(num)

    //for reverse number
    for (num in 100.downTo(10))
        println(num)
    
    //below code returns same output as above
    for (num in 1.rangeTo(100).reversed())
        println(num)
}