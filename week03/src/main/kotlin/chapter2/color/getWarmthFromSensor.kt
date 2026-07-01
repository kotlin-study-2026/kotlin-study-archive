package kos.chapter2.color

import kos.chapter2.color.Color.*

fun getWarmthFromSensor(): Color{
    return when (val color = readln()){
        "red", "Red" -> RED
        "blue", "Blue" -> BLUE
        "green", "Green" -> GREEN
        "purple", "Purple" -> PURPLE
        else -> throw Exception()
    }
}