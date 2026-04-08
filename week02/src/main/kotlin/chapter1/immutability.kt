package kos.chapter1

private fun main(){

    // 자동 타입 추론
    var x = 10
    // val y = 10
    var y = 10

    try {
        x = 20  // ✅ 정상
        y = 20  // ❌ val이면 컴파일 에러

    } catch(e: Exception) {
        println(e)
    } finally {
        println("x = $x")
        println("y = $y")
    }
}