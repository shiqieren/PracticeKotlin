package com.lyw.practicekotlin

fun main() {
    val num = 149
    if (num in 0..59){
        println("不及格")
    }else{
        println("及格")
    }
    whenstatement(2);
}
//语句 （无返回）和 表达式（带返回）

fun whenstatement(week:Int){

    val info = when(week){
        1 -> "差"
        2 -> "差"
        3 -> "差"
        4 -> "差"
        5 -> "差"
        6 -> "差"
        7 -> "差"
        else -> {
            println("不可估量")
        }
    }
    println(info)
}