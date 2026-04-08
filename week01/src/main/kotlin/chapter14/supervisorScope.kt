package chapter14

import kotlinx.coroutines.*

private fun main(): Unit = runBlocking {
    supervisorScope {
        launch { throw Exception() }
        launch { println("살아있음") }
    }
}