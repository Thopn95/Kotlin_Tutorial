package hello

//class Person{
//    var firstName: String = ""
//}

//? co the null
//class Person constructor(val firstname: String, val lastName: String, var age: Int?){
open class Person (open val firstName: String, val lastName: String, var age: Int?){
    private var fullName = "$firstName $lastName"
    //initalizer blocks khoi lenh thuc hien sau khi khoi tao doi tuong
    init{
        println("Initialized with firstName : $firstName, lastname : $lastName, age : $age")
    }

    open fun talk(message: String = ""){
        println("$fullName says $message")
    }
}

class Engineer (var fieldOfStudy: String, firstName: String, lastName: String,age: Int?):Person(firstName,lastName,age){
    override val firstName = super.firstName.toUpperCase()
    override fun talk(message: String) {
        super.talk(message)
        println("I am a Engineer")
    }
}
fun main(args: Array<String>) {
    var person = Person("Phan", "Ngoc Tho",null)
    println("Function details. FirstName = ${person.firstName}, LastName = ${person.lastName}")
    person.talk("hello")
    println("------------")
    var engineer:Engineer = Engineer("mechanics","Alan","Turing",30)
    println("Function details. FirstName = ${engineer.firstName}, LastName = ${engineer.lastName}")
    engineer.talk(" Good evening")


}