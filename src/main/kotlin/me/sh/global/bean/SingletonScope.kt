package me.sh.global.bean

import me.sh.domain.system.system.controller.SystemController
import me.sh.domain.wiseSaying.wiseSaying.controller.WiseSayingController
import me.sh.domain.wiseSaying.wiseSaying.repository.WiseSayingRepository
import me.sh.domain.wiseSaying.wiseSaying.service.WiseSayingService

object SingletonScope {
    val wiseSayingController by lazy { WiseSayingController() }
    val wiseSayingService by lazy { WiseSayingService() }
    val wiseSayingRepository by lazy { WiseSayingRepository() }
    val systemController by lazy { SystemController() }
}