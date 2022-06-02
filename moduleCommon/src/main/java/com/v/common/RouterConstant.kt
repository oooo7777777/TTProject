package com.v.common

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.didi.drouter.api.DRouter
import com.didi.drouter.router.RouterCallback.ActivityCallback
import com.didi.drouter.utils.RouterLogger


object RouterConstant {

    const val ROUTER_FRAGMENT_HOME = "/homeModule"
    const val ROUTER_FRAGMENT_ME = "/meModule"


    /**
     * router onActivityResult
     */
    fun routerFinish(
        activity: Activity,
        bundle: Bundle? = null,
    ) {

        val intent = activity.intent
        bundle?.let {
            intent.putExtras(it)
        }
        activity.setResult(AppCompatActivity.RESULT_OK, intent)
        activity.finish()
    }

    /**
     * router 跳转
     */
    private fun routerGo(
        context: Context,
        path: String,
        bundle: Bundle? = null,
        activityResult: ((resultCode: Int, intent: Intent?) -> Unit)? = null,
    ) {

        val dRouter = DRouter.build(path)
        if (bundle != null) {
            dRouter.putExtras(bundle)
        }
        if (activityResult == null) {
            dRouter.start(context)
        } else {
            dRouter.start(context, object : ActivityCallback() {
                override fun onActivityResult(resultCode: Int, intent: Intent?) {
                    activityResult.invoke(resultCode, intent)
                }
            })
        }

    }


    /**
     * 登录
     */
    class LoginRouter {
        companion object {
            const val PATH = "LoginActivity"
        }

        fun go(context: Context, onActivityResult: (resultCode: Int, intent: Intent?) -> Unit) {
            routerGo(context, PATH, activityResult = onActivityResult)
        }
    }


}