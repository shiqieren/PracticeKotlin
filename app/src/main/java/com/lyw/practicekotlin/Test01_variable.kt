package com.lyw.practicekotlin


var a : Int = 1  //变量
val b : Double = 2.0  //只读变量
const val PI = 3.1415 //常量
fun main() {
    a= 2
//    b = 3.0 val只能初始化一次，只读
    val c:Float = 4.0f  //置灰色可省略，自动类型推导 等价于val c = 4.0f
    println("first test")
    println("first test $a")
    println("first test "+ b)
    println("first test $c")
    println("first test "+ PI)
//    const val PI = 3.1415  无非定义局部的常量
}