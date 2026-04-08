package chapter14

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// blocking
fun blocking() = runBlocking {
    launch {
        delay(1000)
        println("A")
    }

    launch {
        delay(500)

        // CPU 오래 점유하는 작업
        val start = System.currentTimeMillis()
        while (System.currentTimeMillis() - start < 2000) {
            // busy loop (2초)
        }

        println("B")
    }
}

private fun main() {
    blocking()
}