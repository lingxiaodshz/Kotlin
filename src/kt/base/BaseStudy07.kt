package kt.base

// sealed关键字修饰的class为子类类型有限的类

fun main(args: Array<String>) {
    // 注意：声明group对象时必须初始化，按照下面的格式
    var group1: Group = Group.FirstGroup()
    group1.doSomething()
    var group2: Group = Group.SecondGroup()
    group2.doSomething()


}

sealed class Group {
    class FirstGroup : Group() {
        override fun doSomething() {
            println("一组")
        }
    }

    class SecondGroup : Group() {
        override fun doSomething() {
            println("二组")
        }
    }

    abstract fun doSomething()
}