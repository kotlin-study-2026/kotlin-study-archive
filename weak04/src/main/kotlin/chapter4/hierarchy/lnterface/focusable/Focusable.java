package chapter4.hierarchy.lnterface.focusable;

interface Clickable {
    default void showOff() {
        System.out.println("I'm clickable!");
    }
}

interface Focusable {
    default void showOff() {
        System.out.println("I'm focusable!");
    }
}

class Button implements Clickable, Focusable {
    @Override
    public void showOff() {
        Clickable.super.showOff();
        Focusable.super.showOff();
    }
}
