package kos.chapter1

import org.springframework.beans.factory.annotation.Autowired

// Java
/*
@RestController
public class MyController {

    private final UserService service;

    public MyController(UserService service) {
        this.service = service;
    }
}
*/

// Kotlin
class UserService

@Autowired
lateinit var service: UserService   // 외부에서 값이 주입되는 순간

val value by lazy {     // 첫 호출 시 초기화
    println("초기화됨")
    10
}

// null 없이 의존성 주입 가능