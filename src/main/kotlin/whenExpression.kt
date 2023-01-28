fun main(args: Array<String>){
    //expresi yang mirip switch di bahasa pemrograman lain
    val nilai = "B"
    when(nilai){
        "A" -> {
            println("Amazing")
        } // multiple value like if expression
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        else -> println("Sorry Try Again Next Year")
    }

    //when apabila terdapat beberapa expresi dengan output sama
    val nilaiAkhir = "A"
    when(nilaiAkhir){
        "A", "B", "C" -> println("Pass")
        else -> println("Sorry Try Again Next Year")
    }

    // When untuk nilai array
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when(nilaiAkhir){
        in nilaiLulus -> println("You are Pass")
        !in nilaiLulus -> println("Sorry You are Not Pass")
    }

    // When untuk mengecek tipe data
    val name = "Vicry"
    when(name){
        is String -> println("This data is String")
        !is String -> println("Nope not String data")
    }

    // When sebagai if expression
    val nilaiAku = 70
    when{
        nilaiAku > 80 -> println("Congrats Your Grade is A")
        nilaiAku > 60 -> println("Good Your Grade is B")
        else -> println("Try Again Next Year")
    }
}