package com.v.common

import android.text.TextUtils
import com.v.base.utils.toBean
import com.v.common.bean.UserBean
import com.v.common.utils.SPUtil


object UserUtil {

    private var token = ""
    private var userBean: UserBean? = null

    private const val SP_TOKEN = "SP_TOKEN"
    private const val SP_USER_INFO = "SP_USER_INFO"
    private fun emptyData() {
        token = ""
        SPUtil.instance.remove(SP_TOKEN)
    }

    fun isLogIn(): Boolean {
        return !(TextUtils.isEmpty(getToken()))
    }

    fun setUserInfo(json: String) {
        json.toBean(UserBean::class.java)?.run {
            SPUtil.instance.put(SP_USER_INFO, json)
        }

    }

    fun getUserBean(): UserBean {
        if (userBean == null) {
            SPUtil.instance.getString(SP_USER_INFO, "")?.run {
                userBean = this.toBean(UserBean::class.java)
            }
        }
        return userBean!!
    }

    fun getToken(): String {
        if (token.isNullOrEmpty()) {
            token = SPUtil.instance.getString(SP_TOKEN, "")
        }
        return token
    }

    fun setToken(s: String) {
        token = s
        SPUtil.instance.put(SP_TOKEN, token)
    }


}