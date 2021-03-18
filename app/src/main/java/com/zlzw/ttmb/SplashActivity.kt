package com.zlzw.ttmb

/**
 * @Author :  ww
 * desc    :  开屏页面
 * time    : 2021-03-03 16:36:41
 */

import androidx.lifecycle.Observer
import com.v.base.BaseActivity
import com.v.base.utils.goActivity
import com.v.common.RouterConstant
import com.v.common.UserUtil
import com.zlzw.ttmb.databinding.ActivitySplashBinding
import com.zlzw.ttmb.model.SplashViewModel

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    override fun initData() {

        if (UserUtil.isLogIn()) {
            this.goActivity(MainActivity::class.java)
        }
        else {
            RouterConstant.goLogin()
        }
    }

    override fun createObserver() {
        mViewModel.listBean.observe(this, Observer {

        })
    }

}