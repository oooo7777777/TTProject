package com.zlzw.me

import android.content.Intent
import android.view.View
import com.didi.drouter.annotation.Router
import com.didi.drouter.utils.RouterLogger
import com.v.base.BaseFragment
import com.v.base.BlankViewModel
import com.v.base.utils.ext.log
import com.v.base.utils.toast
import com.v.common.RouterConstant
import com.zlzw.me.databinding.MMeFragmentBinding


@Router(path = RouterConstant.ROUTER_FRAGMENT_ME)
class MeFragment : BaseFragment<MMeFragmentBinding, BlankViewModel>(), View.OnClickListener {


    override fun initData() {
        mViewBinding.v = this
    }


    override fun createObserver() {
    }


    override fun onClick(v: View) {

        when (v.id) {
            mViewBinding.bt1.id -> {
                RouterConstant.goLogin(mContext,onActivityResult = { _: Int, intent: Intent? ->
                    intent?.run {
                        (this.extras?.getString("result"))?.toast()
                    }

                })
            }
            mViewBinding.bt2.id -> {
                "onClick".log()
            }
            mViewBinding.bt3.id -> {
                "onClick".log()
            }
        }

    }
}