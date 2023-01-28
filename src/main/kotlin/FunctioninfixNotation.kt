infix fun String.to(type: String): String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    var name = "Vicry" to "UP"
    var nameApp = "IGTV" to "LOW"
    println(name)
    println(nameApp)
}