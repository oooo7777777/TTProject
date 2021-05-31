package com.zlzw.home

import android.graphics.Color
import com.v.base.BaseFragment
import android.view.View
import androidx.lifecycle.Observer
import com.didi.drouter.annotation.Router
import com.v.base.utils.ext.divider
import com.v.base.utils.ext.linear
import com.v.base.utils.ext.loadData
import com.v.common.RouterConstant
import com.zlzw.home.adapter.HomeFragmentAdapter
import com.zlzw.home.model.HomeViewModel
import com.zlzw.home.databinding.HFragmentHomeBinding

/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
@Router(path = RouterConstant.ROUTER_FRAGMENT_HOME)
class HomeFragment : BaseFragment<HFragmentHomeBinding, HomeViewModel>(), View.OnClickListener {

    private var page = 1

    private val mAdapter by lazy {
        mViewBinding.recyclerView.divider {
            setColor(Color.parseColor("#ff0000"))
            setDivider(10)
        }.linear(HomeFragmentAdapter()) as HomeFragmentAdapter
    }

    override fun initData() {
        mViewBinding.v = this
        mViewBinding.refreshLayout.autoRefresh()
        mViewModel.getData(page)
    }

    override fun createObserver() {
        mViewModel.bean.observe(this, Observer {
            it.data?.run {
                mAdapter.loadData(mViewBinding.refreshLayout,
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