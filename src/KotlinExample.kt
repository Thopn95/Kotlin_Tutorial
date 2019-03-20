package hello

fun main(args: Array<String>){
    println("Hello World")
    var x: Double = 3.15
    x = 5.23
    println("x : $x")

    val creditCardNumber = 1234_456_789_101L
    println("creditCardNumber  : $creditCardNumber")

    val aInt: Int? = 123
    val aLong: Long? = aInt?.toLong()
    println("aLong : $aLong")

    var aConvertFloat: Float = "123.56".toFloat()
    println("aConvertFloat : $aConvertFloat")

    var a: Double = 0.0
    var b: Double = -0.0
    if(a==b)
        println("a is equals to b")
    else
        println("a is not equals to b")

    var z: Double = 10.0
    var a1:Double =z
    var b1:Double =z
    if(a1 === b1) //gia tri va vung nho gia tri
        println("a1 is identical to b")

    val aTrueValue = (100>99) && (2>1)
    println("aTrueValue : $aTrueValue")

}