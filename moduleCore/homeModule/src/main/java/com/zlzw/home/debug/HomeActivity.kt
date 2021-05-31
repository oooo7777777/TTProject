package com.zlzw.home.debug

import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.ext.addFragment
import com.zlzw.home.HomeFragment
import com.zlzw.home.databinding.HHomeActivityBinding

class HomeActivity : BaseActivity<HHomeActivityBinding, BlankViewModel>() {

    override fun initData() {
        this.addFragment(HomeFragment(), mViewBinding.llRoot.id)
    }

    override fun createObserver() {

    }
}