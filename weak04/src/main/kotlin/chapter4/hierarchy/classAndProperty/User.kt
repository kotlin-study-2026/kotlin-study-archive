package kos.chapter4.hierarchy.classAndProperty

class User constructor(_nickname: String) { // 주 생성자
    val nickname: String
    var age: Int = 30

    // 부 생성자
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    // 초기화 블록
    init{
        this.nickname = _nickname
    }
}