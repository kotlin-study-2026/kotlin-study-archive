package kos.chapter1

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
fun String.isEmail(): Boolean {
    return this.contains("@")
}

val result = "test@test.com".isEmail()

// Mapper 클래스 필요 없음