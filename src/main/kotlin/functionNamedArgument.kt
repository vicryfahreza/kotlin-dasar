fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("$firstName $middleName $lastName")
}


fun main(args: Array<String>){
    fullName(
        firstName = "Vicry",
        lastName = "Fahreza",
        middleName = "Takeshi"
    )
}