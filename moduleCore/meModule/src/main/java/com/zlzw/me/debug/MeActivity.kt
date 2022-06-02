package com.zlzw.me.debug

import com.v.base.VBActivity
import com.v.base.VBBlankViewModel
import com.zlzw.me.databinding.MMeActivityBinding

class MeActivity : VBActivity<MMeActivityBinding, VBBlankViewModel>() {

    override fun initData() {

//        val fragment = ARouter.getInstance().build(RouterConstant.ROUTER_FRAGMENT_ME).navigation() as Fragment
//
//        mContext.addFragment(fragment, R.id.llRoot)
    }

    override fun createObserver() {
    }
}