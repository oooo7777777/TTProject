package com.zlzw.me

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.BaseFragment
import com.v.base.BlankViewModel
import com.v.base.utils.ext.log
import com.v.common.RouterConstant
import com.zlzw.me.databinding.MMeFragmentBinding


@Route(path = RouterConstant.ROUTER_FRAGMENT_ME)
class MeFragment : BaseFragment<MMeFragmentBinding, BlankViewModel>(), View.OnClickListener {


    override fun initData() {
        mViewBinding.v = this
    }


    override fun createObserver() {
    }


    override fun onClick(v: View) {

        when (v.id) {
            mViewBinding.bt1.id -> {
                "onClick".log()
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