package chapter4.hierarchy.inner;

// Java
public class Outer {
    static class Nested { }

    class Inner {
        final Outer this$0;

        Inner(Outer this$0) {
            this.this$0 = this$0;
        }

        Outer outer(){
            return this$0;
        }
    }
}
