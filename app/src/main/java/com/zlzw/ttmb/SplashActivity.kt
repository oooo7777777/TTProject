package com.zlzw.ttmb

/**
 * @Author :  ww
 * desc    :  开屏页面
 * time    : 2021-03-03 16:36:41
 */

import com.v.base.VBActivity
import com.v.base.VBBlankViewModel
import com.v.base.utils.goActivity
import com.zlzw.ttmb.databinding.ActivitySplashBinding

class SplashActivity : VBActivity<ActivitySplashBinding, VBBlankViewModel>() {

    override fun initData() {
        this.goActivity(MainActivity::class.java)
    }

    override fun createObserver() {

    }

}