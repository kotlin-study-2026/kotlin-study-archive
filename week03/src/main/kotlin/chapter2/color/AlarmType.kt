package kos.chapter2.color

import kotlin.random.Random

enum class AlarmType {

    NOTICE {
        override fun handle() {
            println("공지 알림 처리")
        }
    },

    LINK {
        override fun handle() {
            println("링크 알림 처리")
        }
    },

    FOLDER {
        override fun handle() {
            println("폴더 알림 처리")
        }
    };

    abstract fun handle()
}

private fun main(){
    val alarmType: AlarmType
    alarmType = AlarmType.entries.toTypedArray()[Random.nextInt(0, 2)]
    alarmType.handle()
}