package kos.chapter2.map

private fun main() {
    val keyOverlap = mapOf(
        "apple" to 1000,
        "apple" to 2000
    )

    println(keyOverlap)     // {apple=2000}

    val valueOverlap = mapOf(
        "apple" to 1000,
        "banana" to 1000
    )

    println(valueOverlap)   // {apple=1000, banana=1000}
}