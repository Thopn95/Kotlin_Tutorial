package hello

import kotlin.reflect.KProperty

class User17{
    var todayTasks: String by DelegatedUser17()

}
class DelegatedUser17{ // class thuc thi ho getter, setter cua class User
    operator fun getValue(thisRef: Any?, property: KProperty<*>):String{ //thisRef = "User" object
        return "$thisRef, thanks for delegating '${property.name}' to me"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("assigned to '${property.name} in $thisRef . Details: $value'")
    }

}
fun main(args: Array<String>){
    var user = User17()
    println(user.todayTasks)
    user.todayTasks = "I make a new video in Kotlin"
}