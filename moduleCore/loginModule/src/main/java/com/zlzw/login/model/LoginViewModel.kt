package com.zlzw.login.model



import androidx.lifecycle.MutableLiveData
import com.v.base.BaseViewModel
import com.v.base.utils.toList
import com.v.common.net.RetrofitManager
import com.zlzw.login.bean.LoginBean

/**
 * author :  ww
 * desc    :  登录
 * time    : 2021-03-03 16:51:14
 */
class LoginViewModel : BaseViewModel() {

    var listBean = MutableLiveData<List<LoginBean>>()

    fun login(username: String,password:String) {

        val map = mapOf(
            "username" to username,
            "password" to password
        )

        request({
            RetrofitManager.instance.post("itaoke.app.user.login", map)
        }, success = {
            listBean.value = it.toString().toList(LoginBean::class.java)
        },dialog = true)

    }

}