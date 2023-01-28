fun main() {
    fun hello(value: String, transformer: (String) -> String): String{
        return "Hello ${transformer(value)}"
    }

    val anonymousUpper = fun(value: String): String{
        return if(value.isBlank()){
            "Upss"
        }else{
            value.toUpperCase()
        }
    }

    // Anonymous function as parameter
    val result1 = hello("Nilou", fun(value: String): String{
        return if(value.isBlank()){
            "Upss"
        }else{
            value.toUpperCase()
        }
    })



    println(hello("Vicry", anonymousUpper))
    println(hello("", anonymousUpper))

    println(result1)
}