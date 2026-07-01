package kos.chapter2.member

private class CustomMember(
    val name: String,
    var age: Int,
    status: Status  // 필드가 아닌 기본 생성자의 매개변수
) {
    // 커스텀 접근자
    var status: Status = status
        get() =
            if (age >= 25)
                Status.Leader
            else
                Status.Member
        set(value) {field = value}
}

fun main() {
    val member = CustomMember("❤서원❤", 25, Status.Leader)
    println(member.status)
}