package kos.chapter4.hierarchy.keywords

private open class Parent {
    open val value: Any = "hello"
    open var variable: Any = "world"
}

private class Child : Parent() {
    override val value: Any
        get() = if (System.currentTimeMillis() % 2L == 0L)
                    "text"
                else
                    123
    override var variable: Any = "hello"
}

private fun main() {
    val p = Child()

    if (p.value is String) {
        // p.value.length 가능할까?
    }

    if (p.variable is String) {
        // p.variable.length 가능할까?
    }
}