package kos.chapter2

private fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
private fun isNotDigit(c: Char) = c !in '0'..'9'

private fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A' .. 'Z' -> "It,s a letter!"
    else -> "I don't know..."
}

private fun main() {
    println(isLetter('q'))
    // true
    println(isNotDigit('x'))
    // true
    println(recognize('8'))
    // It's a digit!
}