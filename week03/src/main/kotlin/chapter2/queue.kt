package kos.chapter2

internal class Queue () {
    private val elements = mutableListOf<Int>()

    fun enqueue(item: Int) {
        elements.add(item)
    }

    fun dequeue(): Int? {
        if (elements.isEmpty()) return null
        return elements.removeAt(0)
    }

    fun peek(): Int? {
        return elements.firstOrNull()
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun size(): Int {
        return elements.size
    }

}