package kos.chapter2.expr

private fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 불필요한 명시적 형 변환
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw Exception()
}

private fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
