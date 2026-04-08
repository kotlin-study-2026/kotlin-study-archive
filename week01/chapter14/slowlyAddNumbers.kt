package kos.chapter14

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun slowlyAddNumbers(a: Int, b: Int): Int {
    println("Waiting a bit before calculating $a + $b")
    delay(500.milliseconds * a)
    val sum = a + b
    println("Waiting return $sum..")
    return sum
}
private fun main() = runBlocking {
    println("Starting the async computation")
    val myFirstDeferred = async { slowlyAddNumbers(2, 2) }
    val mySecondDeferred = async { slowlyAddNumbers(4, 4) }
    println("Waiting for the deferred value to be available")
    println("The first result: ${myFirstDeferred.await()}")
    println("The second result: ${mySecondDeferred.await()}")
}