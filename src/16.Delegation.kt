package hello
// delegation la nho ai do lam viec gi do
interface BirdInf{
    fun flyAndFindFood()
}
class Eagle(val age:Int) : BirdInf{
    override fun flyAndFindFood() {
        println("I'm an eagle. I am $age years old. I am flying and finding food")
    }
}
class Cuckoo(b: BirdInf):BirdInf by b{
//    override fun flyAndFindFood() {
//        println("I'm a Cuckoo. I am flying and finding food")
//    }
}
fun main(args: Array<String>){
    val eagle = Eagle(2)
    eagle.flyAndFindFood()
    val cuckoo = Cuckoo(eagle)
    cuckoo.flyAndFindFood()
}