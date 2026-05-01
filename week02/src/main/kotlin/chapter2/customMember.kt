package kos.chapter2

import kos.chapter2.member.Status

private class CustomMember(
    val name: String, // 단순 저장
    val age: Int
) {
    val status: Status // 커스텀 파라미터
        get() = if (age >= 25) Status.Leader else Status.Member
}

fun main() {
    val member = CustomMember("❤서원❤", 25)
    println(member.status)
}