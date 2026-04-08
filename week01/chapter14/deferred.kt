package kos.chapter14

import kotlinx.coroutines.*

private fun main(): Unit = runBlocking {
    val deferred = async {
        delay(1000)
        42
    }
    println(deferred.isActive)

    val result = deferred.await()
    println(result)

    val a = async { 10 }
    val b = async { 20 }

    println(a.await() + b.await())

    val ex = async {
        throw Exception("에러")
    }

    try {
        ex.await()
    } catch (e: Exception) {
        println("잡힘")
        println(ex.isActive)
    }
}