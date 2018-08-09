package kt.base

fun main(args: Array<String>) {
    var father = Father()
    var son = Son()
    father.say()
    son.say()

    var woman = Woman()

    //TODO 匿名内部类如何声明不知道

}

fun anonymousTest(man: Man) {
    man.sleep()
}

//继承
open class Father {
    open fun say() {
        println("大声说")
    }
}

// 和java不同
// 如果子类想继承父类，父类如果非abstract，必须标记为open才行，否则无法继承，默认是不允许继承的
// 同理，父类方法如果需要重写，除非是abstract方法，否则需要声明为open
// 子类方法重写父类方法时必须用override标记
class Son : Father() {
    override fun say() {
        println("小声说")
    }
}

//抽象
// 类中有抽象方法，则该类必须为抽象
abstract class Human {
    abstract fun eat()
    abstract fun sleep()
}

// 若只重写一个方法，仍需声明为抽象
abstract class Man : Human() {
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("男人爱吃肉")
    }
}

class Woman : Human() {
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("女人爱吃水果")
    }

    override fun sleep() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("女人躺着睡觉")
    }

}
