package kos.chapter2.member

sealed class Status{
    object Leader : Status()
    object Member : Status()
}

// 코틀린 코드
// val, var 차이를 확인해주세요 :)
// 자바의 생성자, 필드와 접근자 메서드를 소괄호와 프로퍼티 작성 한 줄로 작성.
class Member(val name : String, var status: Status)

// name이라는 이름의 기본 생성자 매개변수와 필드,
// name 필드에 접근이 가능한 getter를 생성.

// status라는 이름의 기본 생성자 매개변수와 필드,
// status 필드에 접근이 가능한 getter와 setter를 생성.

fun main() {
    val member = Member("gmin", Status.Leader)
    println(member.name) // 코틀린에서 이걸 보는 순간 이름 게터를 호출합니다.
    println(member.status)

    member.status = Status.Member //코틀린이 자동으로 세터 호출함.
    println(member.status)

    //member.name = "smin" // 이건 왜 오류일까요?
}