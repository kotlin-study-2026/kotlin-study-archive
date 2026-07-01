package chapter2;

public class expression {
    private static String name = "gmin";

    public static void main(String[] args) {
        // 자바는 코틀린과 달리 if가 문이여서, 값이 나오지 않음.
        if (name instanceof String) {
            System.out.println(name);
        }
        System.out.println(name = "❤서원❤"); // 자바는 코틀린과 달리, 대입이 식임.
    }
}
