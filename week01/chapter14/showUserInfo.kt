package kos.chapter14

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Credentials
class UserID
class UserData

suspend fun login(credentials: Credentials): UserID {
    println("로그인 요청 대기중..")
    delay(1000)
    println("로그인 완료")
    return UserID()
}

suspend fun loadUserData(userID: UserID): UserData {
    println("유저 데이터 불러오는 중..")
    delay(1000)
    println("유저 데이터 도착")
    return UserData()
}

suspend fun showData(data: UserData){
    println("유저 데이터 보여주는 중..")
    delay(1500)
    println("유저 데이터 보여주기 끝")
}

suspend fun showUserInfo(credentials: Credentials) {
    println("UI 그리는 중..")
    val userID = login(credentials)
    val userData = loadUserData(userID)
    showData(userData)
    println("UI 그리기 끝")
}

private fun main(){
    println("main 함수 시작")
    runBlocking {

        val count = Thread.activeCount()
        println("현재 활성 스레드 수: $count")


        launch {
            val count = Thread.activeCount()
            println("현재 활성 스레드 수: $count")

            val userID = showUserInfo(Credentials())
        }

        launch {
            val count = Thread.activeCount()
            println("현재 활성 스레드 수: $count")

            println("숫자 계산 중..")
            delay(500)
            println("숫자 계산 끝")
        }

        launch {
            val count = Thread.activeCount()
            println("현재 활성 스레드 수: $count")

            println("빈둥거리는 중..")
            delay(1500)
            println("빈둥거리기 끝")
        }
    }
    println("main 함수 끝")
}