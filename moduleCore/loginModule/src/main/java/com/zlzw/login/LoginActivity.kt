package com.zlzw.login


import android.os.Bundle
import android.view.View
import com.didi.drouter.annotation.Router
import com.v.base.BaseActivity
import com.v.base.utils.finish
import com.v.common.RouterConstant
import com.zlzw.login.databinding.LActivityLoginBinding
import com.zlzw.login.model.LoginViewModel

/**
 * author :  ww
 * desc    :  登录
 * time    : 2021-03-03 16:51:14
 */
@Router(path = RouterConstant.LoginRouter.PATH)
class LoginActivity : BaseActivity<LActivityLoginBinding, LoginViewModel>(), View.OnClickListener {


    override fun initData() {
        mViewBinding.v = this
    }

    override fun createObserver() {

    }

    override fun onClick(v: View) {
        when (v.id) {
            mViewBinding.btLogin.id -> {

                var bundle = Bundle()
                bundle.putString("result", "LoginActivity finish数据")
                this.finish(RESULT_OK, bundle)


//                mViewModel.login(
//                    mViewBinding.etMobile.text.toString(),
//                    mViewBinding.etPassword.text.toString()
//                )
            }
        }
    }

}