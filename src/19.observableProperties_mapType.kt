package hello
import java.util.*
import kotlin.properties.Delegates

class Employee(name: String){
    var currentAddess : String by Delegates.observable("no address"){// run this block when 'currentAddess' changes
        prop, oldAddress, newAddress -> run{
            println("Address is changnig")
            println("From $oldAddress -> $newAddress")
            println("property's name = ${prop.name}")
        }
    }
}

//Staring Properties in a Map = like to "store in a json with key-value pairs"
var employeeObject = /*mutable = 'can be changed'*/mutableMapOf<String, Any?>("name" to "Ngoc Tho", "age" to 35)

class Customer(val mapObject: Map<String, Any?>){ // a class of "map" property
    val name: String by mapObject
    val age: Int by mapObject
}
fun main(args: Array<String>){
    val employee = Employee("Phan Ngoc Tho")
    employee.currentAddess = "315 Ngo Quyen\n"+
                            "Son Tra, Da Nang\n"+
                            "Viet Nam"
    employee.currentAddess = "111 Phan Dinh Phung\n"+
                                "Quan 2, TP HCM\n"+
                                "Viet Nam"
    println("Employee's details. Name = ${employeeObject.getValue("name")}. age = ${employeeObject.getValue("age")}")
    employeeObject.set("name","Ngoc Hoang")
    println("Employee's details. Name = ${employeeObject.getValue("name")}. age = ${employeeObject.getValue("age")}")
    val customer = Customer(mapOf(
        "name" to "John Lasseter",
        "age" to 28
    ))
    println("Customer's details. Name = ${customer.name}, age = ${customer.age}")
}