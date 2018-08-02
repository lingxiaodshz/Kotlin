package kt.base

//函数
// 无返回值类型右侧用Unit，可以省略
fun main(args: Array<String>): Unit {
    println(add(3, 4))

    sayHello("小明")

    showList()

    showMap()
}

fun add(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sayHello(name: String) {
    println("hello $name")

    println(template("天安门"))
    println(template("人民大会堂"))

    println(getName(null))

    println(template1("天安门"))
    println(template1("人民大会堂"))
}

//字符串模板
fun template(place: String): String {
    return """
        今天我们去${place}游玩，离很远就看到${place}${place.length}个大字。
    """.trimIndent()
}

//Kotlin空值
//注意：此种情况下函数中是不能传入null的，传入会报错的，
// 如果许可传入null，则可以在参数烈性后面添加?
fun getName(name: String?): String {
    return "名字是${name}"
}

//when用法，类似于switch/case
fun dit2Ch(num: Int): String {
    if (num > 5 || num < 1) {
        return ""
    }
    var result = ""
    when (num) {
        1 -> result = "一"
        2 -> result = "二"
        3 -> result = "三"
        4 -> result = "四"
        5 -> result = "五"
    }
    return result
}

fun template1(place: String): String {
    return """
        今天我们去${place}游玩，离很远就看到${place}${dit2Ch(place.length)}个大字。
    """.trimIndent()
}

//Kotlin 区间
//[1,10] 1..10
//[1,10) 1 until 10

//List
fun showList() {
    var list = listOf<String>("苹果", "桃子", "香蕉", "菠萝")
    for (fruit in list) {
        println(fruit)
    }

    for ((i, fruit) in list.withIndex()) {
        println("$i $fruit")
    }

    println(list[2])
    println(list.get(2))
}

//Map
fun showMap(): Unit {
    var fruits: HashMap<String, String> = HashMap()
    fruits.put("apple", "苹果")
    fruits.put("orange", "橘子")
    fruits.put("peach", "桃子")
    fruits.put("pineapple", "菠萝")

    for ((e, f) in fruits) {
        println("$e  $f")
    }
}