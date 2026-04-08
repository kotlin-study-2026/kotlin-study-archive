package kos.chapter1

private fun nullChecker(str: String?) {
    if (str != null) {
        println(str)    // 자동으로 non-null로 인식
    } else {
        println("yesNull")
    }
}

private fun main() {

    // 타입 자체가 다름
    val notNull: String = "notNull" // 절대 null 불가
    val yesNull: String? = null     // null 가능

    nullChecker(notNull)
    nullChecker(yesNull)
}