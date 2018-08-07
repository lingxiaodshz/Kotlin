package kt.base

import java.math.BigInteger

fun main(args: Array<String>) {

//    handExecption()

    println(factorial(5))

    //大数阶乘
    println(bigFactorial(BigInteger("5")))
    println(bigFactorial(BigInteger("50")))

    //类的使用
    var person = Person("小明", 12)
    println("${person.name}的年龄是${person.age}")
    var stu = Student("Jim", 15)
    println("${stu.name}的年龄是${stu.age}")
    var tea = Teacher("Kate", 15)
    println("${tea.name}的年龄是${tea.age}")

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
    return n * bigFactorial(n - BigInteger.ONE)
}

//类主构造方法
//注意此处如果不加var声明，则对象无法引用构造方法中的参数
class Person(var name: String, var age: Int)

//主构造方法初始化一
class Student(name: String, age: Int) {
    var name: String? = name
    var age: Int? = age
}

//主构造方法初始化二
class Teacher(name: String, age: Int) {
    var name: String?
    var age: Int?

    init {
        this.name = name
        this.age = age
    }
}
