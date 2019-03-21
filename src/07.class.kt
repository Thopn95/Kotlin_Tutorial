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
    //getter & setter
    var isAdult: Boolean
        get() {
            println("Prepare to get isAdult")
            if(age == null){
                return false
            }else if (age!! > 18){ // !! khac null
                return true
            }
            return false
        }
        set(value) {
            println("Prepare to set isAdult")
            age = if (value == true) 18 else null
        }

    lateinit var language : String //lateinit cho phep khoi tao sau nhung khong cho phep thuoc tinh null
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

    //getter
    println("${engineer.firstName} is an adult ? ${engineer.isAdult}")
    //setter

//    engineer.isAdult = false
    println("${engineer.firstName} is age ? ${engineer.age}")

    engineer.language = "English"
    println("Details. Language : ${engineer.language}")
}