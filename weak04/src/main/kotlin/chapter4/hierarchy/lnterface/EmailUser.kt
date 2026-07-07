package kos.chapter4.hierarchy.lnterface

interface EmailUser {
    val email: String

    val nickname: String
        // = email.substringBefore('@')   ❌
        get() = email.substringBefore('@')  // ✅
}
// Kotlin
class KotlinButton {
    /*public final */fun click() {}
}