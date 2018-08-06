package kt.base

import java.math.BigInteger

fun main(args: Array<String>) {

//    handExecption()

    println(factorial(5))

    //大数阶乘
    println(bigFactorial(BigInteger("5")))
    println(bigFactorial(BigInteger("50")))
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

//阶乘
fun factorial(n: Long): Long {
    if (n <= 1) {
        return 1
    }
    return n * factorial(n - 1)
}

//大数阶乘
fun bigFactorial(n: BigInteger): BigInteger {
    if (n == BigInteger.ONE) {
        return BigInteger.ONE
    }
    return n* bigFactorial(n- BigInteger.ONE)
}