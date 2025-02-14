package me.sh

class App {
    fun run() {
        println("== 명언 앱 ==")

        var wiseSayings: MutableList<WiseSaying> = mutableListOf()

        var lastId = 1

        while (true) {
            print("명령) ")

            val input = readlnOrNull()!!.trim()

            if (input == "종료")
                break
            else if (input == "등록") {
                print("명언 : ")
                val content = readlnOrNull()!!.trim()
                print("작가 : ")
                val author = readlnOrNull()!!.trim()

                val id = lastId++
                println("${id}번 명언이 등록되었습니다.")
            }
        }
    }
}