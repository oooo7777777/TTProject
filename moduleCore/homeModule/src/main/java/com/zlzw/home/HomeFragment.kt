package com.zlzw.home

import android.graphics.Color
import android.view.View
import androidx.lifecycle.Observer
import com.didi.drouter.annotation.Router
import com.v.base.VBFragment
import com.v.base.utils.ext.vbDivider
import com.v.base.utils.ext.vbLinear
import com.v.base.utils.ext.vbLoadData
import com.v.common.RouterConstant
import com.zlzw.home.adapter.HomeFragmentAdapter
import com.zlzw.home.databinding.HFragmentHomeBinding
import com.zlzw.home.model.HomeViewModel

/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
@Router(path = RouterConstant.ROUTER_FRAGMENT_HOME)
class HomeFragment : VBFragment<HFragmentHomeBinding, HomeViewModel>(), View.OnClickListener {

    private var page = 1

    private val mAdapter by lazy {
        mDataBinding.recyclerView.vbDivider {
            setColor(Color.parseColor("#ff0000"))
            setDivider(10)
        }.vbLinear(HomeFragmentAdapter()) as HomeFragmentAdapter
    }

    override fun initData() {
        mDataBinding.v = this
        mDataBinding.refreshLayout.autoRefresh()
        mViewModel.getData(page)
    }

    override fun createObserver() {
        mViewModel.bean.observe(this, Observer {
            it.data?.run {
                mAdapter.vbLoadData(mDataBinding.refreshLayout,
                    this,
                    page,
                    onRefresh = {
                        page = 1
                        mViewModel.getData(page)
                    },
                    onLoadMore = {
                        page = it
                        mViewModel.getData(page)
                    },
                    onItemClick = { view: View, i: Int ->
                    })
            }

        })
    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }

}