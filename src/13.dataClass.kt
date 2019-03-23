package hello

/**
 * Data Class
 */

//Data class => purpose is hold data
data class User(var name:String, var age:Int){

}
fun main(args: Array<String>){
    var user = User(name = "Tho Phan",age = 23)
    println(user.toString())
    var backupUser =  user.copy()
//    backupUser.age = 30
    println(backupUser.toString())

    //hasCode = object content
    println(backupUser.hashCode())
    println(user.hashCode())
//    if(backupUser.hashCode() == user.hashCode()){
    if(backupUser.equals(user)){
        println("Two object have the same content")
    }else{
        println("Two object have NOT the same content")
    }
}