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