package kos.chapter2

val name : String = "gmin"

fun main() {
    val result = if (name is String) name else "이름 없음"
    // if문이 식임을 보기 위해 억지로 작성된 코드임.
    // 현실적으로는 val result = name ?: "이름 없음"
    println(result)

    // val rename = result()
}

