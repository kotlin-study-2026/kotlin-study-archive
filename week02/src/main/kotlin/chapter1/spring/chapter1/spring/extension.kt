package kos.chapter1.spring.chapter1.spring

// Java
/*
public class StringUtils {
    public static boolean isEmail(String str) {
        return str.contains("@");
    }
}

StringUtils.isEmail("test@test.com");
*/
// Kotlin
class Gmin

fun String.isEmail(): Boolean {
    return this.contains("@")
}

fun Gmin.well(){}

val result = "test@test.com".isEmail()

// Mapper 클래스 필요 없음