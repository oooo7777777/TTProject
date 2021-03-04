package com.zlzw.ttmb.model

/**
 * @Author :  ww
 * desc    :  开屏页面
 * time    : 2021-03-03 16:36:41
 */

import androidx.lifecycle.MutableLiveData
import com.v.base.BaseViewModel
import com.v.base.utils.ext.toList
import com.zlzw.common.net.RetrofitManager
import com.zlzw.ttmb.bean.SplashBean

class SplashViewModel : BaseViewModel() {

    var listBean = MutableLiveData<List<SplashBean>>()

    fun getList(page: Int) {

        val map = mapOf(
            "pageNum" to page.toString()
        )

        request({
            RetrofitManager.instance.get("data/category/Girl/type/Girl/page/page/count/20", map)
        }, success = {
            listBean.value = it.toString().toList(SplashBean::class.java)
        })

    }

}