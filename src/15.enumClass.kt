package hello

import org.omg.PortableInterceptor.INACTIVE

enum class CompassDirection{
    EAST,
    WEST,
    SOUTH,
    NORTH
}
enum class Color(val red:Int,val green:Int, val Blue:Int){
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255)
}
enum class ActionState{
    ACTIVE{
        override fun reverseAction() = INACTIVE
    },
    INACTIVE{
        override fun reverseAction() = ACTIVE
    };
    abstract fun reverseAction():ActionState
}
fun main(args: Array<String>) {
    println("North enum = ${CompassDirection.NORTH}")
    println(Color.BLUE.toString())
    println("Color details.name : ${Color.BLUE.name}, ordinal : ${Color.BLUE.ordinal}")
    println(Color.valueOf("BLUE"))
    for(colorValue in Color.values()){
        println("Color value is : $colorValue")
    }
    println(ActionState.ACTIVE.reverseAction())
    println(ActionState.INACTIVE.reverseAction())
}