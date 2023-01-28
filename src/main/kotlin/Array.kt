fun main(args: Array<String>){
//    Belajar Array di Kotlin
    val members: Array<String> = arrayOf("Vicry", "Budi", "Ilham")
//    members[0] = "Tono"
    members.set(0, "Tono")
    println(members[0])
    println(members.get(0))


    val membersGoib: Array<String?> = arrayOfNulls(10)
    println(membersGoib[0])
}