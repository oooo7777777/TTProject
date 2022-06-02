package com.zlzw.home.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder
import com.zlzw.home.R
import com.zlzw.home.bean.HomeBean
import com.zlzw.home.databinding.HItemFragmentHomeBinding

/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
class HomeFragmentAdapter :
    BaseQuickAdapter<HomeBean.Data, BaseDataBindingHolder<HItemFragmentHomeBinding>>(R.layout.h_item_fragment_home) {

    override fun convert(holder: BaseDataBindingHolder<HItemFragmentHomeBinding>, item: HomeBean.Data) {
        holder.dataBinding?.run {
            bean = item
            executePendingBindings()
        }

    }

}