package kt.base

import java.util.*

fun main(args: Array<String>) {
    var father = Father()
    var son = Son()
    father.say()
    son.say()

    var woman = Woman()

    // 匿名内部类声明
    // 注意：匿名内部类前面一定要用object修饰，这是一个关键字
    var man = object : Man() {
        override fun smoke() {
        }

        override fun sleep() {
            println("男人站着睡")
        }
    }

    man.eat()
    man.sleep()

    woman.eat()
    woman.sleep()


    // 注意：object关键字后面的区别，是否带括号
    var beautifulWoman = object : BeautifulWoman() {
        override fun makeup() {
            println("女人爱化妆")
        }
    }
    var bea = object : IMakeup {
        override fun makeup() {

        }
    }

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
// 注意实现接口后面没有（），继承抽象类后面有（）
abstract class Man : Human(), ISmoke {
    override fun eat() {
        println("男人爱吃肉")
    }
}

class Woman : Human() {
    override fun eat() {
        println("女人爱吃水果")
    }

    override fun sleep() {
        println("女人躺着睡觉")
    }
}

abstract class BeautifulWoman : IMakeup {

}


// 接口反应的是事物的能力，抽象类反应的是事物的本质
interface ISmoke {
    fun smoke()
}

interface IMakeup {
    fun makeup()
}
