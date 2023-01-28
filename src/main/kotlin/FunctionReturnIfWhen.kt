fun main(){
    fun sayHello(name: String = ""): String{
        return if(name == ""){
            "Hello Bro"
        }else{
            "Hello $name"
        }
    }

    fun sayOMG(name: String = ""): String{
        return when(name){
            "" -> "OMG Friend"
            else -> "OMG $name"
        }
    }

    println(sayHello())
    println(sayHello("Vicry"))

    println(sayOMG())
    println(sayOMG("Frederica"))
}