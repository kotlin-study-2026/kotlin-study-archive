package kos.chapter2

fun main() {
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
    // 1 2 3 4 5 6 7 8 9 10

    var j = 10
    do {
        println(j)
        j--
    } while (j > 0)
    // 10 9 8 7 6 5 4 3 2 1
}