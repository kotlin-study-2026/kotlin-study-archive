package kos.chapter2

private fun main() {
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
    // 1 2 3 4 5 6 7 8 9 10

    var j = 10
    do {
        println(j)
        j--
    } while (j > 0)
    // 10 9 8 7 6 5 4 3 2 1

    val outerCondition = true
    val innerCondition = true
    val shouldExitInner = true
    val shouldSkipInner = true
    val shouldExitOuter = true
    val shouldSkipOuter = true

    outer@ while (outerCondition) {
        while (innerCondition){
            if(shouldExitInner) break
            if(shouldSkipInner) continue
            if(shouldExitOuter) break@outer
            if(shouldSkipOuter) continue@outer
        }
    }
}