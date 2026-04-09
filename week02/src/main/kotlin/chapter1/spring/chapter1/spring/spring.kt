package kos.chapter1.spring.chapter1.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication // 어노테이션 같은 프레임워크 기능을 사용하며...
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>( *args)
}

@RestController
class GreetingResource {
    @GetMapping
    fun index(): List<Greeting> = listOf(
        Greeting(1, "Hello!"),
        Greeting(2, "Bonjour!"),
        Greeting(3, "Guten Tag!"),
    )
}

data class Greeting(val id: Int, val text: String)