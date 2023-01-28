fun sayHello1(firstName: String, lastName: String?){
    if(lastName == null){
        print("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

// Function Default Argument
fun sayHelloWithArgs(firstName: String, lastName: String? = null){
    println("Hello $firstName $lastName")
}

fun main(args: Array<String>){
    sayHello1("Ricky", "Rich")
    sayHelloWithArgs("Mahendra")
}