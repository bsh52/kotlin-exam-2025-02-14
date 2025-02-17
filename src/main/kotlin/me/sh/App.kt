package me.sh

import me.sh.global.bean.SingletonScope
import me.sh.global.rq.Rq

class App {
    fun run() {
        val wiseSayingController = SingletonScope.wiseSayingController
        val systemController = SingletonScope.systemController

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")

            val input = readlnOrNull()!!.trim()

            val rq = Rq(input)

            when (rq.action) {
                "종료" -> {
                    systemController.actionExit(rq)
                    break
                }

                "등록" -> wiseSayingController.actionWrite(rq)
                "목록" -> wiseSayingController.actionList(rq)
                "삭제" -> wiseSayingController.actionDelete(rq)
                "수정" -> wiseSayingController.actionModify(rq)
            }
        }
    }
}