package hello

fun main(args: Array<String>){
    var a: Double = 6.2
    var b: Double = 5.2
    if(a>=b){
        println("a is larger than equal b")
    }else{
        println("a is smaller than equal b")
    }
    var aString = if (a>=b) "large" else "smaller"
    println("aStrig : $aString")
    //"when" as a variable
    var c: Char = 'a'
    var stringResult: String = when(c){
        'a'-> "First character of the alphabel"
        'z'-> "Last character of the alphabel"
        else -> "other character"
    }
    println("stringResult : $stringResult")
    //"when" as a function
    fun checkNumber(inputNumber: Int)=when(inputNumber){
        0 -> {
            println("this is zero")
        }
        1,2 -> {
            println("one or two")
        }
        in 3..10 -> println("a few, several")
        else -> println("many")
    }
    checkNumber(0)
    checkNumber(11)
    //for loop
    val intNumbers: Array<Int> = arrayOf(11,22,43, 55)
    println("for loop")
    for(intNumber in intNumbers){
        println("intNumber : $intNumber")
    }
    println("using indices")
    for (index in intNumbers.indices){
        println("value at index : $index is ${intNumbers[index]}")
    }
    //using index, value pair
    for ((index,value) in intNumbers.withIndex()){
        println("Value at index = $index is $value")
    }
    var x: Long = 10
    while( x > 0){
        x--
        println("x = $x")
    }

}