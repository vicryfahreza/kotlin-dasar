fun main(args: Array<String>){
    // for untuk array
    val names = arrayOf("Vicry","Fahreza","Ottoman","Kurniawan", "Joko","Tarmanin")
    var total = 0
    for(name in names){
        println(name)
        total++
    }
    println("Perulangan terjadi sebanyak = $total")

    // for untuk range
    // for(value in 1..100){
    // print("$value \t")
    //}
    for(value in 50 downTo 0 step 5){
        print("$value \t")
    }
    println(" ")

    // mengabungkan perulangan range dengan array
    val jumlahArray = names.size - 1
    for(i in 0..jumlahArray){
        println("indeks ke $i = ${names.get(i)}")
    }
}