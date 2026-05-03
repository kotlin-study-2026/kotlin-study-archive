package kos.chapter2.color

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> "red"
        Color.BLUE  -> "blue"
        Color.GREEN -> "green"
        Color.PURPLE -> "purple"
    }
}

fun main() {
    println(getMnemonic(Color.BLUE))
}