fun main() {
    var num = 200
    var c: Int = 1
    var u=0;  var v = 1
    do{
        c=u+v
        u=v
        v=c
        print("$c  ")

    }while (c<num)
}