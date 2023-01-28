fun main() {
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }

    // it keyword
    // syaratnya hanya boleh 1 parameter lambda
    val lambdaSatu: (String) -> String = {
        it.toUpperCase()
    }

    // Method Reference
    fun toUpper(value: String): String = value.toUpperCase()
    val ref = ::toUpper

    println(lambdaName("Vicry"))
    println(lambdaSatu("Budi"))
    println(ref("Santoso"))
}