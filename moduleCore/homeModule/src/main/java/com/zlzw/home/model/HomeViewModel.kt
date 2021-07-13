package com.zlzw.home.model

import androidx.lifecycle.MutableLiveData
import com.v.base.VBApplication.Companion.apiBase
import com.v.base.VBViewModel
import com.zlzw.home.bean.HomeBean

/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
class HomeViewModel : VBViewModel() {

    var bean = MutableLiveData<HomeBean>()

    fun getData(page: Int) {

        val map = mapOf(
            "pageNum" to page.toString()
        )

        vbRequest(
            {
                apiBase.get("https://gank.io/api/v2/data/category/Girl/type/Girl/page/" + page + "/count/20")
            },
            bean
        )

    }

}