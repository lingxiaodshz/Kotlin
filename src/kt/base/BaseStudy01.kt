@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package kt.base

//在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
fun main(args: Array<String>) {
    //下面两种方式的书写都可以
//    val a: Int = 6
    val a = 5
    val a1 = 1.5
    println(a === a)
    print(a1)


//    由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。
//    这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
//    val b: Byte = 1 // OK, 字面值是静态检测的
//    val i: Int = b // 错误

//    可以代用其toInt()方法。
    val b: Byte = 1
    val i: Int = b.toInt()


}