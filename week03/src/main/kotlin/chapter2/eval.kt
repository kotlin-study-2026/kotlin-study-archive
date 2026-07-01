package kos.chapter2

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 불 필요함.
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}
fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

}
