package com.zlzw.home.debug

import com.v.base.VBActivity
import com.v.base.VBBlankViewModel
import com.v.base.utils.vbAddFragment
import com.zlzw.home.HomeFragment
import com.zlzw.home.databinding.HHomeActivityBinding

class HomeActivity : VBActivity<HHomeActivityBinding, VBBlankViewModel>() {

    override fun initData() {
        this.vbAddFragment(HomeFragment(), mDataBinding.llRoot.id)
    }

    override fun createObserver() {

    }
}