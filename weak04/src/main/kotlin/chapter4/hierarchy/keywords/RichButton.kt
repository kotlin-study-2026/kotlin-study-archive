package kos.chapter4.hierarchy.keywords

import kos.chapter4.hierarchy.lnterface.focusable.Clickable

open class RichButton : Clickable {
    fun disable() {
    /* final */
    }

    open fun animate() {
    /* override 가능 */
    }

    override fun click() {
    /* override 가능 */
    }

    /*final override fun click() {
        override 불가능
    }*/
}