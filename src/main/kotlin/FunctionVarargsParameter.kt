fun hitungTotal(vararg values: Int): Int{
    var total = 0
    for(value in values){
        total += value
    }
    return total
}

fun hitung(vararg values: Int): Int{
    var total = 1
    for(value in values){
        total *= value
    }
    return total
}


fun main(){
    val values = arrayOf(10,20,10)
    // println(hitungTotal(values))
    println(hitungTotal(10,20,30,50))
    println(hitung(2,1,2,7,8))
}