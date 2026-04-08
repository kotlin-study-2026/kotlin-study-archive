package chapter14

import kotlinx.coroutines.*

suspend fun load() = coroutineScope {
    println("계산 중..")
    delay(1000)
    val a = async { 1 }
    val b = async { 2 }
    a.await() + b.await()
}

private fun main(): Unit = runBlocking {
    val a = load()
    println(a)
}