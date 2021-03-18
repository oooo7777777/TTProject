package com.zlzw.home

import android.graphics.Color
import com.v.base.BaseFragment
import android.view.View
import androidx.lifecycle.Observer
import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.annotaion.RecyclerViewItemOrientation
import com.v.base.utils.divider
import com.v.base.utils.grid
import com.v.base.utils.linear
import com.v.base.utils.loadData
import com.v.common.RouterConstant
import com.zlzw.home.adapter.HomeFragmentAdapter
import com.zlzw.home.model.HomeViewModel
import com.zlzw.home.databinding.HFragmentHomeBinding

/**
 * author  :
 * desc    :
 * time    : 2021-03-18 17:40:42
 */
@Route(path = RouterConstant.ROUTER_FRAGMENT_HOME)
class HomeFragment : BaseFragment<HFragmentHomeBinding, HomeViewModel>(), View.OnClickListener {

    private var page = 1

    private val mAdapter by lazy {
        mViewBinding.recyclerView.divider {
            orientation = RecyclerViewItemOrientation.GRID
            includeVisible = true
            setColor(Color.parseColor("#ff0000"))
            setDivider(20)
        }.grid(HomeFragmentAdapter(), 3) as HomeFragmentAdapter
    }

    override fun initData() {
        mViewBinding.v = this
        mViewBinding.refreshLayout.autoRefresh()
        mViewModel.getList(page)
    }

    override fun createObserver() {
        mViewModel.listBean.observe(this, Observer {
            mAdapter.loadData(mViewBinding.refreshLayout,
                it,
                page,
                onRefresh = {
                    page = 1
                    mViewModel.getList(page)
                },
                onLoadMore = {
                    page = it
                    mViewModel.getList(page)
                },
                onItemClick = { view: View, i: Int ->
                })
        })
    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }

}