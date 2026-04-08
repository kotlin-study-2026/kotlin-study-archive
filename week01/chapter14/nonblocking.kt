package kos.chapter14

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// nonblocking
fun nonblocking() = runBlocking {
    launch {
        delay(1000)
        println("A")
    }

    launch {
        delay(500)
        println("B")
    }
}

private fun main() {
    nonblocking()
}