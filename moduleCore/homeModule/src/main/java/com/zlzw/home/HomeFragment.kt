package com.zlzw.home

import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.BaseFragment
import com.v.base.BlankViewModel
import com.v.common.RouterConstant
import com.zlzw.home.databinding.HHomeFragmentBinding


@Route(path = RouterConstant.ROUTER_FRAGMENT_HOME)
class HomeFragment : BaseFragment<HHomeFragmentBinding, BlankViewModel>()
{
    override fun initData() {
    }

    override fun createObserver() {
    }


}