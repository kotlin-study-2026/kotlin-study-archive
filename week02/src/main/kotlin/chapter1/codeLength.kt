package kos.chapter1

// Java
/*
public class User {
    private String name;        => 매개변수로 할당

    public User(String name) {  => 생성자 자동 생성
        this.name = name;
    }

    public String getName() {   => val로 안전한 불변 프로퍼티 생성
        return name;
    }
}
*/

// Kotlin
data class User(val name: String)

// DTO, Entity, Response 객체 생성에 유리