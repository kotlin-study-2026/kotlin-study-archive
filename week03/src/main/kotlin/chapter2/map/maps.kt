package kos.chapter2.map

private fun main(){

    val lmap = linkedMapOf(
        "B" to 2,
        "A" to 1,
        "C" to 3
    )

    println(lmap.keys)  // [B, A, C]

    val smap = sortedMapOf(
        "B" to 2,
        "A" to 1,
        "C" to 3
    )

    println(smap.keys)  // [A, B, C]

    val hmap = hashMapOf(
        "A" to 1,
        "B" to 2
    )

    println(hmap)
}