package kos.chapter2.color

 enum class Color(
    val r : Int,
    val g : Int,
    val b : Int
){
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    PURPLE(70, 38, 121),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
    fun printColor() = println("$this ${rgb()}")
}

fun main(){
    println(Color.RED.rgb())
    Color.BLUE.printColor()

}