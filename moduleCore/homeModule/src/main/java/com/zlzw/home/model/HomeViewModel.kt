package com.zlzw.home.model

import androidx.lifecycle.MutableLiveData
import com.v.base.BaseViewModel
import com.v.base.utils.toList
import com.v.common.net.RetrofitManager
import com.zlzw.home.bean.HomeBean

/**
 * author  :
 * desc    :
 * time    : 2021-03-18 17:40:42
 */
class HomeViewModel : BaseViewModel() {

    var listBean = MutableLiveData<List<HomeBean>>()

    fun getList(page: Int) {

        val map = mapOf(
            "pageNum" to page.toString()
        )

        request({
            RetrofitManager.instance.get("https://gank.io/api/v2/data/category/Girl/type/Girl/page/" + page + "/count/20")
        }, success = {
            listBean.value = it.toString().toList(HomeBean::class.java)
        })

    }

}