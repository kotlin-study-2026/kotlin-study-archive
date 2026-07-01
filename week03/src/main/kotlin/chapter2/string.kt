package kos.chapter2

private fun main(){
    val input = readln()
    val name = if(input.isNotBlank()) input else "Kotlin"

    println("Hello, $name")

    // println("$name님 반가와요!")   ❌
    println("${name}님 반가와요!") // ✅

    println("Hello, \$name")

    println('H')    //String ❌ Char ✅
}