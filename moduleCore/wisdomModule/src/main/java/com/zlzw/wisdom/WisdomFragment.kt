package com.zlzw.wisdom

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.BaseFragment
import com.v.base.BlankViewModel
import com.v.base.utils.log
import com.v.common.RouterConstant
import com.zlzw.wisdom.databinding.WWisdomFragmentBinding


@Route(path = RouterConstant.ROUTER_FRAGMENT_WISDOM)
class WisdomFragment : BaseFragment<WWisdomFragmentBinding, BlankViewModel>(), View.OnClickListener {


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