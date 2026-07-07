package kos.chapter4.hierarchy.classAndProperty

private class Person(var birthYear: Int) {
    var address: String = "unspecified"
        set(value) {
            println("$field -> $value")
            field = value
        }
    
    var ageIn2050: Int
        get() = 2050 - birthYear
        set(value) {
            birthYear = 2050 - value
        }
}