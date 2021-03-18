package com.zlzw.wisdom.debug

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter
import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.addFragment
import com.v.common.RouterConstant
import com.zlzw.wisdom.R
import com.zlzw.wisdom.databinding.WWisdomActivityBinding

class WisdomActivity : BaseActivity<WWisdomActivityBinding, BlankViewModel>() {

    override fun initData() {

        val fragment = ARouter.getInstance().build(RouterConstant.ROUTER_FRAGMENT_WISDOM).navigation() as Fragment

        mContext.addFragment(fragment, R.id.llRoot)
    }

    override fun createObserver() {
    }
}