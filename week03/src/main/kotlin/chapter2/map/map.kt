package kos.chapter2.map

private fun main() {
    val binaryReps = mutableMapOf <Char, String>()  // <- 코틀린 가변 맵은 원소 이터레이션 순서를 보존한다.
    for (char in 'A'..'F') {    // <- A부터 F까지 문자의 범위를 사용해 이터레이션한다.
        val binary = char.code.toString(radix = 2)  // <- 아스키 코드를 2진 표현으로 바꾼다.
        binaryReps[char] = binary   // c를 키로 c의 2진 표현을 맵에 넣는다.
    }

    for ((letter, binary) in binaryReps) {  // 맵에 대해 이터레이션한다. 맵의 키를 letter에,
        println("$letter = $binary")        // 키와 연관된 값을 binary에 대입한다.
    }
    // A = 1000001
    // B = 1000010
    // C = 1000011
    // D = 1000100
    // E = 1000101
    // F = 1000110
}