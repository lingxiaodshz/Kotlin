package kt.base

fun main(args: Array<String>) {
    println(sub(5, 8))

    printTest("46464")

    println(n(3, 5))
    println(m(3, 5))

    //此处可以输入两个参数，第一个参数会替换掉默认参数
    println(获取圆的面积(1f, 2f))
    //具名参数使用（默认参数则会被用到）
    println(获取圆的面积(半径 = 2f))

    //字符串和数字
    var a = "3"
    var b = 3
    var c = "a3"
    a = b.toString()
    b = a.toInt()
    //运行时会报错，需要先判断，暂时未找到如何判断
//    b = c.toInt()


    //从键盘输入读取
    println("请输入第一个数字:")
    // "!!"表示可以强制不为空，"?"表示可以为空
    var num1 = readLine()!!.toInt()
    println("请输入第二个数字:")
    var num2 = readLine()!!.toInt()

    println("$num1 + $num2 = ${num1 + num2}")


}

//函数表达式
//函数体只有一行时可以写成如下形式
fun sub(a: Int, b: Int): Int = a - b

fun printTest(name: String) = println("$name")

//类似于函数指针,两种方式
var n = { a: Int, b: Int -> a * b }

var m: (Int, Int) -> Int = { x, y -> x + y }


//默认参数和具名参数
val PI = 3.14f

//默认参数，注意调用时具名参数的场景
fun 获取圆的面积(pi: Float = PI, 半径: Float): Float = pi * 半径 * 半径
