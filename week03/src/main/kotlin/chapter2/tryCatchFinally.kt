package kos.chapter2

private fun main(){
    try {
        println("try 블록 실행")
        val result = 10 / 2
        println("결과: $result")
    } catch (e: Exception) {
        println("예외 발생: ${e.message}")
    } finally {
        println("finally 실행 (항상 실행됨)")
    }

    val value = try {
        println("try 블록 실행")
        val result = 10 / 0
        result
    } catch (e: Exception) {
        println("예외 발생: ${e.message}")
        -1
    } finally {
        println("finally 실행 (항상 실행됨)")
    }

    println(value)
}