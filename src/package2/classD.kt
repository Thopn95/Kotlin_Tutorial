package hello.package2

import hello.package1.classA

public open class classD{
    protected open val p1=1
    init {
        println("Initialize classD")
    }
}
class SubClassD: classD(){
    override val p1 = 2
}
public fun function4(){
    println("This is function 4")
    var classA = classA()
    var subClassD = SubClassD()
//    subClassD.p1 cannot access p1 because it used protected

}