package kt.base

// Kotlin面向对象的代理和委托
fun main(args: Array<String>) {
    // 可以看到此时调用的是儿子的wash方法
    var father = SHFather()
    father.wash()

    var grandFather = GrandFather()
    grandFather.wash()
}

interface IWash {
    fun wash()
}

class BHSon : IWash {
    override fun wash() {
        println("儿子洗衣服")
    }
}

// 注意：此时SHFather类并没有重写wash方法，而是由BHSon代理执行
class SHFather : IWash by BHSon() {
}

// 代理之后仍然可以重写wash方法
class GrandFather : IWash by BHSon() {
    override fun wash() {
        println("爷爷放好水")
        BHSon().wash()
    }
}