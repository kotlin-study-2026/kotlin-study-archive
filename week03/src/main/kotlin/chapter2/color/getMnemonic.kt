package kos.chapter2.color

fun getMnemonic(color: Color): String {
    /* when과 컴파일 결과가 거의 같은 코드
    if (color == Color.RED){}
    else if (color == Color.BLUE){}
    else if (color == Color.GREEN){}
    else if (color == Color.PURPLE){}
    */

    /*return when (color) {
        Color.RED -> "red"
        Color.BLUE  -> "blue"
        Color.GREEN -> "green"
        Color.PURPLE -> "purple"
    }*/
    return when {
        color == Color.RED -> "red"
        color == Color.BLUE  -> "blue"
        color == Color.GREEN -> "green"
        color == Color.PURPLE -> "purple"
        else -> throw Exception()
    }
}

fun main() {
    println(getMnemonic(Color.BLUE))
}