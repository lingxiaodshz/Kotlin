package kt.base

fun main(args: Array<String>) {

    handExecption()


}

// 异常处理
fun handExecption(): Unit {
    var flag = true
    while (flag) {
        println("请输入第一个数字:")
        var numStr1 = readLine()
        println("请输入第二个数字:")
        var numStr2 = readLine()

        try {
            var num1 = numStr1!!.toInt()
            var num2 = numStr2!!.toInt()
            println("$num1 + $num2 = ${num1 + num2}")
            flag = false
        } catch (e: Exception) {
            println("输入有问题，请重新输入")
        }
    }
}