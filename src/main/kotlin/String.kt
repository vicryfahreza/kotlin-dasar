fun main(args: Array<String>){
    // Trim Margin
    var firstname = "Vicry"
    var lastname = "Fahreza"
    var alamat = """
Jln Mawar 8
Perumahan Villa Taman Bandara 
Kab.Tanggerang
    """
    println(firstname)
    println(lastname)
    println(alamat)

    var alamat1 = """
        >Jln Kaiba Corps
        >Taman Pegasus
        >Domino City
    """.trimMargin(">")
    println(alamat1)

    // String Template
    println("""
        |Nama depan : $firstname
        |Nama belakang : $lastname
        |Alamat : $alamat
    """.trimMargin())

    var fullName = firstname + lastname
    println("Panjang karakter = ${fullName.length}")
}