package com.zlzw.ttmb

/**
 * @Author :  ww
 * desc    :  开屏页面
 * time    : 2021-03-03 16:36:41
 */

import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.goActivity
import com.zlzw.ttmb.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding, BlankViewModel>() {

    override fun initData() {
        this.goActivity(MainActivity::class.java)
    }

    override fun createObserver() {

    }

}