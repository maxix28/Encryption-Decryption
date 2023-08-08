package encryptdecrypt
fun first(input:String):String{
    var result=""
    for ( a in input){
        if("[a-z]".toRegex().matches(a.toString()))
        { result+=('z' - (a - 'a'))}
        else result +=a
    }
    return result
}
fun main() {
    println(first("we found a treasure!"))
}