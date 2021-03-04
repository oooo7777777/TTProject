package com.zlzw.login


import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.v.base.BaseActivity
import com.zlzw.common.RouterConstant
import com.zlzw.login.databinding.LActivityLoginBinding
import com.zlzw.login.model.LoginViewModel

/**
 * author :  ww
 * desc    :  登录
 * time    : 2021-03-03 16:51:14
 */
@Route(path = RouterConstant.LoginRouter.PATH)
class LoginActivity : BaseActivity<LActivityLoginBinding, LoginViewModel>(), View.OnClickListener {


    override fun initData() {
        mViewBinding.v = this
    }

    override fun createObserver() {

    }

    override fun onClick(v: View) {
        when (v.id) {
            mViewBinding.btLogin.id -> {
                mViewModel.login(mViewBinding.etMobile.text.toString(),mViewBinding.etPassword.text.toString())
            }
        }
    }

}