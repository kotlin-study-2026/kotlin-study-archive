package kos.chapter4.`object`

private class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String): User =
            User(email.substringBefore('@'))
    }
}

private fun main(){
    User./*Companion.*/newSubscribingUser("bob@mail.com")
    val companion = User.Companion
    companion.newSubscribingUser("bob@mail")
}