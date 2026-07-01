package kos.chapter2

import kos.chapter2.color.Color

fun mixOptimized (c1: Color, c2: Color) =
    when { // 인자가 없는 경우 내부 조건은 boolean 형식임. else 강제
        (c1 == Color.RED && c2 == Color.BLUE )  -> "purple"
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(mixOptimized(Color.BLUE, Color.RED))

}