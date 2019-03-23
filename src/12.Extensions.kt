package hello

class A{
    fun methodA(){
        println("method A of class A")
    }
    fun methodX(){
        println("method X of class A")
    }
    fun B.methodB2(){
        methodA()
        this.methodB()
        methodX() //call from class B because this fun used by B
        this@A.methodX()
    }
    fun callB2FromA(b: B){
        b.methodB2()
    }
}
class B{
    fun methodB(){
        println("method B of class B")
    }
    fun methodX(){
        println("method X of class B")
    }
}
fun main(args: Array<String>){
    val listOfString:MutableList<String> = mutableListOf("Zero","One","Two","Three","Four")
    listOfString.swap2Elements(0,1)
    println("listOfString : $listOfString")
    println("pi = ${Calculation.PI()}")
    println("2*pi = ${Calculation.doublePI()}")
    var b = B()
//    b.methodB2()
    var a = A()
    a.callB2FromA(b)

}