package kos.chapter1

private fun funPrograming(){

}

private fun main(){

    // 객체지향 프로그래밍 (명령형 -> How)
    val list = listOf(1, 2, 3)
    val temp = mutableListOf<Int>()
    for (i in list) {
        if (i * 2 > 2) {
            temp.add(i * 2)
        }
    }
    println(temp)

    // 함수형 프로그래밍 (선언형 -> What)
    println(listOf(1, 2, 3)
        .map { it * 2 }
        .filter { it > 2 })
}