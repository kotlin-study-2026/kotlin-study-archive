package kos

// 진입점 인자 생략 가능
// public static void main X
fun main(/*String[] args 없어도 됨*/ ) {
    // print, println은 표준 라이브러리이기 때문에
    // System.out. 같은 클래스 호출 X
    println("Hello World!") // 세미콜론 X
}

// 타입은 이름 뒤 콜론으로 지정
private fun max(a: Int, b: Int): Int {

    // 자바의 삼항 연산자 ((a > b) ? a : b;)
    // if는 문이 아닌 식
    return if (a > b) a else b
}