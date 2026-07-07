package kos.chapter4.hierarchy.accessController

internal open class TalkativeButton {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}
/*

// 확장 함수의 범위가 더 넓다면, 컴파일 에러
// internal 클래스에게 public 확장 함수는 에러
*/
/*internal *//*
fun TalkativeButton.giveSpeech() {
    // private와 protected는 외부 참조 불가능
    yell()
    whisper()
}*/
