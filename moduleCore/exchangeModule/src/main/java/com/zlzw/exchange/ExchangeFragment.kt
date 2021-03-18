package com.zlzw.exchange

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.BaseFragment
import com.v.base.BlankViewModel
import com.v.base.utils.log
import com.zlzw.common.RouterConstant
import com.zlzw.exchange.databinding.EExchangeFragmentBinding


@Route(path = RouterConstant.ROUTER_FRAGMENT_EXCHANGE)
class ExchangeFragment : BaseFragment<EExchangeFragmentBinding, BlankViewModel>(), View.OnClickListener {


    override fun initData() {
        mViewBinding.v = this
    }


    override fun createObserver() {
    }


    override fun onClick(v: View) {

        when (v.id) {
            R.id.bt1 -> {
                "onClick".log()
            }
            R.id.bt2 -> {
                "onClick".log()
            }
            R.id.bt3 -> {
                "onClick".log()
            }
        }

    }
}