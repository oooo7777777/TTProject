package com.v.common

import com.alibaba.android.arouter.launcher.ARouter
import com.v.base.BaseApplication
import com.v.common.BuildConfig

open class MyApplication : BaseApplication() {
    override fun isDebug(): Boolean {
        return BuildConfig.LOG_DEBUG
    }

    override fun baseUrl(): String {
        return "https://gank.io/api/v2/"
    }

    override fun initData() {
        initARouter()
    }

    private fun initARouter() {

        if (BuildConfig.LOG_DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}