package kos.chapter2

data class User(var name: String)

fun main() {

    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.size())
    println(stack.peek())

    val user = User("윤지")
    user.name="❤서원❤"
    // user = User("지민")

    var userB = User("지민")
    userB = User("현우")

    val queue = Queue()
    val a = queue
    a.enqueue(1)
    println(queue.size())

    val list = mutableListOf("one", "two", "three", "four")
    list.add("five")
    //list = mutableListOf("one", "two", "three", "four")
}