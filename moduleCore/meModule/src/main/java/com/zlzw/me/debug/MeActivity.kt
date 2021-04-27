package com.zlzw.me.debug

import androidx.fragment.app.Fragment
import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.addFragment
import com.v.common.RouterConstant
import com.zlzw.me.R
import com.zlzw.me.databinding.MMeActivityBinding

class MeActivity : BaseActivity<MMeActivityBinding, BlankViewModel>() {

    override fun initData() {

//        val fragment = ARouter.getInstance().build(RouterConstant.ROUTER_FRAGMENT_ME).navigation() as Fragment
//
//        mContext.addFragment(fragment, R.id.llRoot)
    }

    override fun createObserver() {
    }
}