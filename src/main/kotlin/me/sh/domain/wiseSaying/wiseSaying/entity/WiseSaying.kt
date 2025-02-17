package me.sh.domain.wiseSaying.wiseSaying.entity

import me.sh.standard.util.json.JsonUtil.jsonStrToMap

data class WiseSaying(
    var id: Int = 0,
    var content: String,
    var author: String,
) {
    constructor(content: String, author: String) : this(0, content, author)

    companion object {
        fun fromJsonStr(jsonStr: String): WiseSaying {
            val map = jsonStrToMap(jsonStr)
            return WiseSaying(
                id = map["id"] as Int,
                content = map["content"] as String,
                author = map["author"] as String,
            )
        }
    }

    fun modify(content: String, author: String) {
        this.content = content
        this.author = author
    }

    fun isNew(): Boolean {
        return id == 0
    }

    val json: String
        get() {
            return """
                {
                    "id": $id,
                    "content": "$content",
                    "author": "$author"
                }
            """.trimIndent()
        }
}
