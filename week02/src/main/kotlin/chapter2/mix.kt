package kos.chapter2

import kos.chapter2.color.Color

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.BLUE) -> Color.PURPLE
        else -> throw Exception("Dirty color") //항상 강제
    }

fun main() {
    println(mix(Color.BLUE, Color.RED))

}
