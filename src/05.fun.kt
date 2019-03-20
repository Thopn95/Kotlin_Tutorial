package hello

fun main(args: Array<String>){
    fun addTwoInts(x: Int, y: Int) : Int {
        return x+y
    }
//    fun addTwoInts(x: Int, y: Int):Int = x+y
    println("add 2 numbers = ${addTwoInts(2,3)}")

    fun areaOfRectangle(width: Double, height: Double = width):Double{
        return width * height
    }
    println("Area of rectangle  : ${areaOfRectangle(2.0)}")

//    fun greet(personName: String?){
    fun greet(personName: String?) : Unit{ //Unit same void func
        if(personName != null)
            println("Hello $personName !")
        else
            println("Hi there")
    }
    greet("Phan Ngoc Tho")
    //Vararg = Variable number of argrements (so luong dau vao bien doi)
    fun functionA(vararg initParam: Int){
        for(eachParam in initParam){
            println("eachParam : $eachParam")
        }
    }
    functionA(1,2,3,4,5)
    println("relaxing..")
    functionA(0,1,2)

    //Infix notation
    infix fun Int.plus(x: Int): Int{
        return this + x
    }
    println("3 + 2 = ${3 plus 2}")
    //de qui
    tailrec fun factorial(n: Long = 1): Long{
        if( n == 1L){
            return 1
        }else{
            return n * factorial(n-1)
        }
    }
    println("factorial 10 : ${factorial(1000)}") //if too large then result return is 0

}