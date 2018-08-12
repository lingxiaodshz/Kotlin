package kt.base

// Kotlin面向对象的代理和委托
fun main(args: Array<String>) {
    // 可以看到此时调用的是儿子的wash方法
    var father = SHFather()
    father.wash()

    var grandFather = GrandFather()
    grandFather.wash()

    println(Season.Autumn.ordinal)
}

interface IWash {
    fun wash()
}

object BHSon : IWash {
    override fun wash() {
        println("儿子洗衣服")
    }
}

// 注意：此时SHFather类并没有重写wash方法，而是由BHSon代理执行
class SHFather : IWash by BHSon {
}

// 代理之后仍然可以重写wash方法
class GrandFather : IWash by BHSon {
    override fun wash() {
        println("爷爷放好水")
        // 这种方式相当于又创建了一个BHSon()对象，如果想直接用的话，可已将BHSon的class改为object
        // 这样BHSon在内存中就会只有一个对象，类似于静态
        BHSon.wash()
    }
}

// 枚举
enum class Season{
    Spring,Summer,Autumn,Winter
}