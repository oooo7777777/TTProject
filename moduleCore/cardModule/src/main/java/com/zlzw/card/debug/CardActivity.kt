package com.zlzw.card.debug

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter
import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.ext.addFragment
import com.zlzw.card.R
import com.zlzw.card.databinding.CActivityCardBinding
import com.zlzw.common.RouterConstant

class CardActivity : BaseActivity<CActivityCardBinding, BlankViewModel>() {

    override fun initData() {

        val fragment = ARouter.getInstance().build(RouterConstant.ROUTER_FRAGMENT_CARD).navigation() as Fragment

        mContext.addFragment(fragment, R.id.llRoot)
    }

    override fun createObserver() {
    }
}