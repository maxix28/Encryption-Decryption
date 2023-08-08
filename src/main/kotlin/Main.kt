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

val alphabet="abcdefghijklmnopqrstuvwxyz"
fun caeser_cypher(input: String,n:Int):String{
    var result=""
    var ind=0
    for ( a in input){
        if(a.isLetter()){
            if((alphabet.indexOf(a,0,false) +n)>26){
                ind=alphabet.indexOf(a,0,false) +n-26}
            else { ind = alphabet.indexOf(a,0,false) +n}

            result+= alphabet[ ind ]    }
        else result +=a
    }
    return result
}
fun main() {
    println(caeser_cypher(readln(), readln().toInt()))

}