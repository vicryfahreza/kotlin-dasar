fun hello(value: String, transformer: (String) -> String): String{
    return "Hello ${transformer(value)}"
}

fun main() {
    val toUpper = { value: String -> value.toUpperCase()}
    val toLow = { value: String -> value.toLowerCase()}

    println(hello("Vicry", toUpper))
    println(hello("KASLANA", toLow))

    val result1 = hello("Ayato"){ value: String -> value.toUpperCase()}
    println(result1)
}