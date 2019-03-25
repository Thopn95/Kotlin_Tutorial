package hello

import kotlin.reflect.KProperty

//class nay uy quyen cho class khac truy cap getter, setter gia tri nao do

class People{
    var todayTask: String by DelegatedPeople() //People delegates 'todayTask to DelegatedPeople
}
class DelegatedPeople{
    //getter
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{ //thisRef = "People Object
        return "$thisRef, Thanks for delegating '${property.name}' to me"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("assigned to '${property.name}' in $thisRef . Details : $value")
    }
}

fun main(args: Array<String>){
    var people = People()
    println(people.todayTask)
    people.todayTask = "I make a new video tutorial in Kotlin"
}