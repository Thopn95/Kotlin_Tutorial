package hello

/**
 * companion object = "staic property / function"
 */
class Calculation{
    companion object {
        fun PI() : Float = 3.1416F
    }
}
//Extentions with companion
fun Calculation.Companion.doublePI() : Float{
    return 2* Calculation.Companion.PI()
}