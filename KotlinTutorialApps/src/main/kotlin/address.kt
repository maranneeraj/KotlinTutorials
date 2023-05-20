class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    fun copyAddress(address: Address): Address {
        val result = Address() // there's no 'new' keyword in Kotlin
        result.name = address.name // accessors are called
        result.street = address.street
        print(result.name)
        return result

    }
}



fun main() {
val address = Address()
    address.copyAddress(address)
    //print(address.copyAddress())
}
