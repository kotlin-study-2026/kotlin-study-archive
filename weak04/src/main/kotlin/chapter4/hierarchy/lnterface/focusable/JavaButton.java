package chapter4.hierarchy.lnterface.focusable;

import kos.chapter4.hierarchy.lnterface.focusable.Clickable;

class JavaButton implements Clickable {
    @Override
    public void click() {
        System.out.println("I was clicked");
    }

    @Override
    public void showOff() {
        System.out.println("I'm showing off");
    }
}
