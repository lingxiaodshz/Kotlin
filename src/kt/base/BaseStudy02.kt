package kt.base

//函数
// 无返回值类型右侧用Unit，可以省略
fun main(args: Array<String>): Unit {
    println(add(3, 4))

    sayHello("小明")

}

fun add(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sayHello(name: String) {
    println("hello $name")

    println(template("天安门"))
    println(template("人民大会堂"))

}

//字符串模板
fun template(place: String): String {
    return """
        今天我们去${place}游玩，离很远就看到${place}${place.length}个大字。
    """.trimIndent()
}