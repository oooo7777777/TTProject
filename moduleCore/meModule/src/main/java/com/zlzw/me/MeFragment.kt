package com.zlzw.me

import android.content.Intent
import android.view.View
import com.didi.drouter.annotation.Router
import com.v.base.VBBlankViewModel
import com.v.base.VBFragment
import com.v.base.utils.log
import com.v.base.utils.toast
import com.v.common.RouterConstant
import com.zlzw.me.databinding.MMeFragmentBinding


@Router(path = RouterConstant.ROUTER_FRAGMENT_ME)
class MeFragment : VBFragment<MMeFragmentBinding, VBBlankViewModel>(), View.OnClickListener {


    override fun initData() {
        mDataBinding.v = this
    }


    override fun createObserver() {
    }


    override fun onClick(v: View) {

        when (v.id) {
            mDataBinding.bt1.id -> {
                RouterConstant.LoginRouter().go(mContext,onActivityResult = { _: Int, intent: Intent? ->
                    intent?.run {
                        (this.extras?.getString("result"))?.toast()
                    }
                })
            }

        }

    }

}