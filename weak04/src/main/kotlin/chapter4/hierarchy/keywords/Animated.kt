package kos.chapter4.hierarchy.keywords

private abstract class Animated {
    abstract val animationSpeed: Double // 오버라이드 필수
    open val frames: Int = 60           // 오버라이드 자유
    val keyframes: Int = 20             // 오버라이드 불가

    abstract fun animate()              // 오버라이드 필수
    open fun stopAnimating() {}         // 오버라이드 자유
    fun animateTwice() {}               // 오버라이드 불가
}

private class Animation : Animated() {
    override val animationSpeed: Double
        get() = 200.0
    // or...
    // override val animationSpeed: Double = 200.0
    override val frames: Int = 30
    // override val keyframes: Int = 20 ❌

    override fun animate() { /* ... */ }
    override fun stopAnimating() {}
    // override fun animateTwive() {} ❌
}

private fun main(){
    // val anime = Animated() ❌
    val anim = Animation() // ✅

    println(anim.animationSpeed)
    // 200.0

    println(anim.frames)
    // 30

    println(anim.keyframes)
    // 20
}