package com.v.common

import android.graphics.Color
import com.didi.drouter.api.DRouter
import com.v.base.VBApplication
import com.v.base.VBConfig
import com.v.base.VBConfigOptions
import com.v.base.net.VBNetOptions
import me.jessyan.autosize.AutoSize
import me.jessyan.autosize.AutoSizeConfig

open class MyApplication : VBApplication() {
    override fun isDebug(): Boolean {
        return BuildConfig.LOG_DEBUG
    }

    override fun initData() {
        initRouter()
        intAutoSize()
        val netOptions = VBNetOptions.Builder()
            .setBaseUrl("https://www.wanandroid.com/")
            .build()

        val options = VBConfigOptions.Builder()
            .setNetOptions(netOptions)
            .setStatusBarColor(Color.parseColor("#ffffff"))
            .build()

        VBConfig.init(options)

    }

    private fun initRouter() {
        DRouter.init(this)
    }

    private fun intAutoSize() {
        AutoSize.initCompatMultiProcess(this)
        AutoSizeConfig.getInstance()
            .setBaseOnWidth(false)
            .setDesignHeightInDp(812).designWidthInDp = 375
    }
}