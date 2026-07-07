package kos.chapter4.hierarchy.lnterface.focusable

internal interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

private interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

private class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        // super.showOff() ❌
        super<Clickable>.showOff() // ✅
        super<Focusable>.showOff() // ✅
    }
}

private fun main() {
    val button = Button()
    button.showOff()
    // I'm clickable!
    // I'm focusable!

    button.setFocus(true)
    // I got focus.

    button.click()
    // I was clicked.
}