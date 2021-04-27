package com.v.common

import android.content.Context
import android.content.Intent
import com.didi.drouter.api.DRouter
import com.didi.drouter.router.RouterCallback.ActivityCallback
import com.didi.drouter.utils.RouterLogger


object RouterConstant {

    const val ROUTER_FRAGMENT_HOME = "/homeModule"
    const val ROUTER_FRAGMENT_ME = "/meModule"


    /**
     * 登录
     */
    class LoginRouter {
        companion object {
            const val PATH = "/loginModule"
        }
    }

    /**
     * 前往登录
     */
    fun goLogin(context: Context,onActivityResult: (resultCode: Int, intent: Intent?) -> Unit) {

        DRouter.build(LoginRouter.PATH)
            .start(context, object : ActivityCallback() {
                override fun onActivityResult(resultCode: Int, intent: Intent?) {
                    onActivityResult(resultCode,intent)
                }
            })
    }
}