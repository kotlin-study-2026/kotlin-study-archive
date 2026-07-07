package kos.chapter4.data

private data class Customer(val name: String){
    var postalCode: Int = 11521
    constructor(name: String, postalCode: Int): this(name){
        this.postalCode = postalCode
    }
}

private fun main() {
    val c1 = Customer("Sam")
    val c2 = Customer("Mart", 15500)
    val c3 = Customer("Sam", 15500)

    println(c1)
    // Customer(name=Sam, postalCode=11521)
    println(c1 == c2)
    // println(c1.equals(c2))
    // false
    println(c1 == c3)
    // true
    println(c1.hashCode())
    // 2580770
    println(c3.hashCode())
    // 2580770
    println(c1 === c2)
    // false
    println(c1 === c3)
    // false
}