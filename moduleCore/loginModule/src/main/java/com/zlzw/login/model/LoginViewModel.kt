package com.zlzw.login.model



import androidx.lifecycle.MutableLiveData
import com.v.base.VBViewModel
import com.zlzw.login.bean.LoginBean

/**
 * author :  ww
 * desc    :  登录
 * time    : 2021-03-03 16:51:14
 */
class LoginViewModel : VBViewModel() {

    var listBean = MutableLiveData<List<LoginBean>>()

    fun login(username: String,password:String) {

        val map = mapOf(
            "username" to username,
            "password" to password
        )

//        request({
//            RetrofitManager.instance.post("itaoke.app.user.login", map)
//        }, success = {
//            listBean.value = it.toString().toList(LoginBean::class.java)
//        },dialog = true)

    }

}