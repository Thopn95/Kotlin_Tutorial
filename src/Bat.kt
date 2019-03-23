package hello

class Bat: AnimalInterface, BirdInterface{
    override fun walk() {
        super.walk()
    }
    override fun fly(){
        super.fly()
    }
    override fun eat(){
        super<AnimalInterface>.eat()
        super<BirdInterface>.eat()
        println("I am a Bat")
    }
}

fun main(args: Array<String>){
    var bat: Bat = Bat()
    bat.walk()
    bat.fly()
    bat.eat()
}