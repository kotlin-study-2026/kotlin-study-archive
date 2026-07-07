package kos.chapter4.hierarchy.lnterface.clickable

private interface Clickable {
    fun click()
}

private class Button : Clickable {
    override fun click() = println("I was clicked")
}

private fun main() {
    Button().click()
    // I was clicked
}