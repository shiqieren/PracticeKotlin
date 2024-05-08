package com.lyw.practicekotlin


fun main() {
    testMethod("liyiwei",18)
    testMethod2("liyiwei2")
    testMethod(i = 20,s = "xxx") //无视参数顺序，按参数1对1传值，具名参数
}

fun testMethod(s: String, i: Int): Int {
    println("name:$s,age $i")
    return 200
}
fun testMethod2(s: String, i: Int = 18): Int {//同C++的默认参数值
    println("name:$s,age $i")
    return 200
}