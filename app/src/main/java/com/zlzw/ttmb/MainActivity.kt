package com.zlzw.ttmb

import com.didi.drouter.api.DRouter
import com.didi.drouter.page.IPageBean.DefPageBean
import com.didi.drouter.page.IPageRouter
import com.didi.drouter.page.RouterPageViewPager
import com.didi.drouter.store.ServiceKey
import com.v.base.BaseActivity
import com.v.base.BlankViewModel
import com.v.base.utils.ext.log
import com.v.common.RouterConstant
import com.zlzw.ttmb.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding, BlankViewModel>() {

    private val aliasRouter = "main_activity_router_page_viewpager"


    private val pageRouter by lazy {
        RouterPageViewPager(supportFragmentManager, mViewBinding.viewPage).apply {
            update(
                DefPageBean(RouterConstant.ROUTER_FRAGMENT_HOME),
                DefPageBean(""),
                DefPageBean(""),
                DefPageBean(""),
                DefPageBean(RouterConstant.ROUTER_FRAGMENT_ME)
            )
        }
    }

    override fun initData() {

        DRouter.register(
            ServiceKey.build(IPageRouter::class.java).setAlias(aliasRouter)
                .setLifecycleOwner(this),
            pageRouter
        )
        mViewBinding.tabLayout.setupWithViewPager(mViewBinding.viewPage)
        mViewBinding.viewPage.offscreenPageLimit = mViewBinding.tabLayout.tabCount
        val titles = arrayOf("界面1", "界面2", "界面3", "界面4", "界面5")
        for (i in 0 until mViewBinding.tabLayout.tabCount) {
            mViewBinding.tabLayout.getTabAt(i)!!.text = titles[i]
        }

    }

    override fun createObserver() {

        //切换fragment
//        DRouter.build(IPageRouter::class.java).setAlias(aliasRouter).getService().run {
//            showPage(DefPageBean(RouterConstant.ROUTER_FRAGMENT_HOME))
//        }
    }


}