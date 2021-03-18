package com.v.common

import com.alibaba.android.arouter.launcher.ARouter


object RouterConstant {

    const val ROUTER_FRAGMENT_HOME = "/home/homeModule"
    const val ROUTER_FRAGMENT_EXCHANGE = "/exchange/exchangeModule"
    const val ROUTER_FRAGMENT_WISDOM = "/wisdom/wisdomModule"
    const val ROUTER_FRAGMENT_CARD = "/card/cardModule"
    const val ROUTER_FRAGMENT_ME = "/me/meModule"


    /**
     * 登录
     */
    class LoginRouter {
        companion object {
            const val PATH = "/login/loginModule"
        }
    }

    /**
     * 前往登录
     */
    fun goLogin() {
        ARouter.getInstance()
            .build(LoginRouter.PATH)
            .navigation()
    }
}