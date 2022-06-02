package com.zlzw.login


import android.os.Bundle
import android.view.View
import com.didi.drouter.annotation.Router
import com.v.base.VBActivity
import com.v.common.RouterConstant
import com.v.common.RouterConstant.routerFinish
import com.zlzw.login.databinding.LActivityLoginBinding
import com.zlzw.login.model.LoginViewModel

/**
 * author :  ww
 * desc    :  登录
 * time    : 2021-03-03 16:51:14
 */
@Router(path = RouterConstant.LoginRouter.PATH)
class LoginActivity : VBActivity<LActivityLoginBinding, LoginViewModel>(), View.OnClickListener {


    override fun initData() {
        mDataBinding.v = this
    }

    override fun createObserver() {

    }

    override fun onClick(v: View) {
        when (v.id) {
            mDataBinding.btLogin.id -> {

                var bundle = Bundle()
                bundle.putString("result", "LoginActivity finish数据")
                routerFinish(mContext, bundle)


//                mViewModel.login(
//                    mDataBinding.etMobile.text.toString(),
//                    mDataBinding.etPassword.text.toString()
//                )
            }
        }
    }

}