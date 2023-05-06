fun main(){
    //Generic object passing Int data type which converts container into Integer type method
    val obj = Container(33)
    var data = obj.getValue()

    //Generic object passing String data type which converts container into String type method
    val obj1 = Container("Neeraj")
    var data1 = obj1.getValue()
    println("Name = $data1 \n Age = $data")
}
class Container<T>(var data : T) {
    fun setValue(value : T)
    {
        data = value
    }
    fun getValue() : T{
        return data
    }
}