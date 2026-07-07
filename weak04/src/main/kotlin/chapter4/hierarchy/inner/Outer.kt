package kos.chapter4.hierarchy.inner

// Kotlin
private class Outer(val name: String) {

    class Nested {
        // fun hello() = "Outer name is $name" 외부와 독립된 클래스

        fun hello() = "I am Nested"
    }

    inner class Inner {
        fun hello() = "Outer name is $name" // 외부에 종속된 클래스

        fun getOuter(): Outer = this@Outer
    }
}

private fun main(){
    val outer = Outer("A")

    val nested = Outer.Nested()     // ✅
    // val inner = Outer.Inner()       ❌

    //val nested = outer.Nested()      ❌
    val inner = outer.Inner()       // ✅
}