package hello

//fun sum(x: Double, y: Double):Double{
//    return x+y
//}

//val sum = {x: Double, y: Double -> x+y} //Lambda
//val sum:(Double, Double)-> Double = {x,y -> x+y} //Lambda

//Anonymous function
var sum = fun(x:Double, y:Double):Double{
    return x+y
}
//Anonymous functions without return value
var sayhello = fun(personName: String){
    println("This is an anonymous function")
    println("Hello : $personName")
}

fun main(args: Array<String>){
    println("Sum = ${sum(10.1,2.3)}")
    sayhello("Tho")
    var doubles = doubleArrayOf(10.0,12.1,14.5,13.4)
    doubles.forEach { eachNumber -> println(eachNumber) } // a lambda function is inside
}