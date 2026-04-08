package org.example.chapter14

import kotlinx.coroutines.*

private fun main(): Unit = runBlocking {

    var job = launch {
        repeat(5) {
            delay(1000)
            println(it)
        }
    }
    println(job.isActive)

    delay(2500)
    println(job.isCancelled)
    job.cancel()
    println(job.isCancelled)
    println(job.isActive)

    job = launch {
        delay(2000)
        println("끝")
    }

    job.join()
    println("다 끝난 후 실행")
    println(job.isCompleted)
    println(job.isActive)
}