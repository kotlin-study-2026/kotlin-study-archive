package kos.chapter2

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "피즈버즈 "
    i % 3 == 0  -> "피즈 "
    i % 5 == 0  -> "버즈 "
    else        -> "$i "
}

fun main() {
    // 기본 범위 순방향
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    println()

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    println()

    for (i in 1 until 10) {
        print("$i ")
    }

}