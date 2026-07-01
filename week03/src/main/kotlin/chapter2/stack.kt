package kos.chapter2

internal class Stack (){
    private val elements = mutableListOf<Int>()

    fun push(item: Int) {
        elements.add(item)
    }

    fun pop(): Int? {
        if (elements.isEmpty()) return null
        return elements.removeAt(elements.size - 1)
    }

    fun peek(): Int? {
        return elements.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun size(): Int {
        return elements.size
    }

}