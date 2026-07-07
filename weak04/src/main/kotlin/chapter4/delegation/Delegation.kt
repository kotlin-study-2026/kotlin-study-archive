package kos.chapter4.delegation

/*class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size

    override fun isEmpty() = innerList.isEmpty()
    override fun contains(element: T) = innerList.contains(element)
    override fun iterator() = innerList.iterator()
    override fun containsAll(elements: Collection<T>) =
        innerList.containsAll(elements)
}*/

class DelegatingCollection<T>(
    private val innerList: Collection<T> = mutableListOf()
) : Collection<T> by innerList  // ❌✅