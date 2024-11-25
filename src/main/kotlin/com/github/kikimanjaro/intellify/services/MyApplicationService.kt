package com.github.kikimanjaro.intellify.services

import com.github.kikimanjaro.intellify.MyBundle
import com.intellij.openapi.components.Service

@Service
class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))
    }
}
