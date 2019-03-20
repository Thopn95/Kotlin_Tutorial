package hello

fun main(args: Array<String>){
    var c:Char = 'c'
    //@ COMMERCIAL AT (U+0040) utf8 character set
    c = '\u0040'
    println("copyright char = $c")
    var d:String = "c"

    val myName = "Tho"
    for(eachChar in myName){
        println("eachChar  : $eachChar")
    }
    val strings: Array<String> = arrayOf("a", "b", "c", "d")
    for(string in strings){
        println("string : $string")
    }

    val intNumbers:Array<Int> = Array<Int>(5,{ i -> 2 * i })
    for(intNumber in intNumbers){
        println("intNumber : $intNumber")
    }

    val text = """
    | There are my tutorial course Kotlin
    |My name is Phan Ngoc Tho
    |My Email : thopn95@gmail.com
    """.trimMargin("|")
    println("text : $text")
}

