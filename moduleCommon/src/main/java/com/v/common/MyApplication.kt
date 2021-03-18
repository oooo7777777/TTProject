package com.v.common

import com.v.base.BaseApplication
import com.v.common.BuildConfig

open class MyApplication : BaseApplication() {
    override fun isDebug(): Boolean {
        return BuildConfig.LOG_DEBUG
    }

    override fun initData() {

    }

}