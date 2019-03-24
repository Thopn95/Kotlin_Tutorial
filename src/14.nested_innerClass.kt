package hello

class Fruit{
    private var watermelon: String = "WaterMelon"
    private var grapes: String = "grapes"
    private var greenApple: String = "greenApple"
    class Nested{
        fun sayHello(){
//            grapes //cannot access to "grapes"
            println("I'm a function inside a NESTED class")
        }
    }
    inner class Inner{
        fun getAppEmoji():String{
            println("I'm a function inside a INNER class")
            println("Apple emoji is $greenApple")
            return greenApple
        }
    }
}
fun main(args: Array<String>){
    Fruit.Nested().sayHello()
    var fruit = Fruit() //Must initialize object before accessing "inner class"
    var innerFruit = fruit.Inner()
    innerFruit.getAppEmoji()
}