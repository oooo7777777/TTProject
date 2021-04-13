package com.zlzw.home.model

import androidx.lifecycle.MutableLiveData
import com.v.base.BaseApplication.Companion.apiBase
import com.v.base.BaseViewModel
import com.v.base.utils.toList
import com.zlzw.home.bean.HomeBean

/**
 * author  :
 * desc    :
 * time    : 2021-03-18 17:40:42
 */
class HomeViewModel : BaseViewModel() {

    var listBean = MutableLiveData<List<HomeBean>>()

    fun getList(page: Int) {

        requestDefault({
            apiBase.get("data/category/Girl/type/Girl/page/" + page + "/count/20")
        }, success = {
            listBean.value = it.toString().toList(HomeBean::class.java)
        })

    }

}