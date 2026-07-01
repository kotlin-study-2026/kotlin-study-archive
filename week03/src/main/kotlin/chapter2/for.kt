package kos.chapter2

private fun main(){
    val list = listOf("A", "B", "C")

    for (item in list) {
        println(item)
    }

    val iterator = list.iterator()

    while (iterator.hasNext()) {
        val item = iterator.next()
        println(item)
    }
}