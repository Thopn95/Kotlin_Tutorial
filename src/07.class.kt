package hello

//class Person{
//    var firstName: String = ""
//}

//? co the null
//class Person constructor(val firstname: String, val lastName: String, var age: Int?){
class Person (val firstname: String, val lastName: String, var age: Int?){
    private var fullName = "$firstname $lastName"
    //initalizer blocks khoi lenh thuc hien sau khi khoi tao doi tuong
    init{
        println("Initialized with firstName : $firstname, lastname : $lastName, age : $age")
    }

    fun talk(message: String = ""){
        println("$fullName says $message")
    }
}

fun main(args: Array<String>) {
    var person = Person("Phan", "Ngoc Tho",null)
    println("Function details. FirstName = ${person.firstname}, LastName = ${person.lastName}")
    person.talk("hello")
}