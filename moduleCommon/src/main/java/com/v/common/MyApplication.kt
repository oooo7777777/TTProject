package com.v.common

import android.graphics.Color
import com.didi.drouter.api.DRouter
import com.v.base.VBApplication

open class MyApplication : VBApplication() {
    override fun isDebug(): Boolean {
        return BuildConfig.LOG_DEBUG
    }

    override fun baseUrl(): String {
        return "https://gank.io/api/v2/"
    }

    override fun statusBarColor(): Int {
        return Color.parseColor("#000000")
    }

    override fun initData() {
        initRouter()
    }

    private fun initRouter() {

        DRouter.init(this)

    }
}