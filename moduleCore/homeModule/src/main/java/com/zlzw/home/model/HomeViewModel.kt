package com.zlzw.home.model

import androidx.lifecycle.MutableLiveData
import com.v.base.VBViewModel
import com.v.base.apiBase
import com.v.common.bean.ApiResponse
import com.zlzw.home.bean.HomeBean


/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
class HomeViewModel : VBViewModel() {

    var homeBean = MutableLiveData<ApiResponse<HomeBean>>()

    fun getData(page: Int) {
        vbRequest(
            {
                apiBase.get("article/list/$page/json")
            },
            homeBean
        )

    }

}