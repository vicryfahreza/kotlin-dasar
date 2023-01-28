fun String.hello(): String = "Hello $this"

fun String.sayHello(): Unit = println("Hello $this")

fun main(){
    val name = "Vicry"
    println(name.hello())
}