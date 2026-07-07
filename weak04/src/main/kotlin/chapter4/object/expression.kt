package kos.chapter4.`object`

private interface Click{
    fun onClick()
    fun onEnter()
}

private fun main(){
    var clickCount = 1

    val listener = object : Click {
        override fun onClick() {
            clickCount++
        }

        override fun onEnter() {
            clickCount*=2
        }
    }

    println(clickCount)
    listener.onClick()
    println(clickCount)
    listener.onEnter()
    println(clickCount)
}