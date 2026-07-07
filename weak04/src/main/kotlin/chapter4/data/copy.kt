package kos.chapter4.data

private fun main(){
    data class Team(var name: String)

    val t1 = Team("jm")
    val t2 = t1.copy()

    t2.name = "Jmin"

    println(t1.name)
    //.copy를 지운다면, t1.name 또한 Jmin
}