package com.v.common

import android.graphics.Color
import com.didi.drouter.api.DRouter
import com.v.base.BaseApplication

open class MyApplication : BaseApplication() {
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
        initARouter()
    }

    private fun initARouter() {

        DRouter.init(this)

    }
}