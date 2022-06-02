package com.zlzw.home

import android.graphics.Color
import android.view.View
import androidx.lifecycle.Observer
import com.didi.drouter.annotation.Router
import com.v.base.VBFragment
import com.v.base.utils.*
import com.v.common.RouterConstant
import com.zlzw.home.adapter.HomeFragmentAdapter
import com.zlzw.home.bean.HomeBean
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
            setDivider(10)
            setColor(Color.parseColor("#ff0000"))
        }.vbLinear(HomeFragmentAdapter()).apply {
            vbConfig(mDataBinding.refreshLayout,
                onRefresh = {
                    page = 1
                    mViewModel.getData(page)
                },
                onLoadMore = {
                    mViewModel.getData(page)
                },
                onItemClick = { _, _, position ->
                    val item = data[position] as HomeBean.Data
                    item.title.toast()
                })
        } as HomeFragmentAdapter
    }


    override fun initData() {
        mDataBinding.v = this
        mDataBinding.refreshLayout.autoRefresh()
        mViewModel.getData(page)
    }

    override fun createObserver() {
        mViewModel.homeBean.observe(this, Observer {
            it.data?.run {
                page = mAdapter.vbLoad(this.datas, page, mDataBinding.refreshLayout)
            }

        })
    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }

}