fun main(){
    // ada syarat untuk menggunakan Tail Recursive
    // Hanya boleh menampilkan fungsi rekursif sendiri
    // jadi rekursif faktorial dan fibonacci itu tidak bisa
    tailrec fun display(num: Int){
        println("Tail Recursive ke-$num")
        if(num > 1){
            display(num - 1)
        }
    }
    println(display(10000))
}