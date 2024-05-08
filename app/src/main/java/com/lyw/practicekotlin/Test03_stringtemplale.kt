package com.lyw.practicekotlin

fun main() {
    val name = "测试测试"
    val value = 1
    println("打印名称$name 打印值$value")
    println("花括号表示式：${if (value == 1)"value == 1" else "打印value == "+value}")
}