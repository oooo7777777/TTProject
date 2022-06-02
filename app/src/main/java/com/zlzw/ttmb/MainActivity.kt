package com.zlzw.ttmb

import androidx.fragment.app.FragmentStatePagerAdapter
import com.didi.drouter.api.DRouter
import com.didi.drouter.page.IPageBean.DefPageBean
import com.didi.drouter.page.IPageRouter
import com.didi.drouter.page.RouterPageViewPager
import com.didi.drouter.store.ServiceKey
import com.v.base.VBActivity
import com.v.base.VBBlankViewModel
import com.v.common.RouterConstant
import com.v.common.views.mg.IndicatorZoom
import com.zlzw.ttmb.databinding.ActivityMainBinding


class MainActivity : VBActivity<ActivityMainBinding, VBBlankViewModel>() {

    private val aliasRouter = "main_activity_router_page_viewpager"


    private val pageRouter by lazy {
        RouterPageViewPager(
            supportFragmentManager,
            mDataBinding.viewPager,
            FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        ).apply {
            update(
                DefPageBean(RouterConstant.ROUTER_FRAGMENT_HOME),
                DefPageBean(RouterConstant.ROUTER_FRAGMENT_ME)
            )
        }
    }

    private val commonNavigator by lazy {

        val titles = resources.getStringArray(R.array.main_tab)
        val iconOffs = arrayOf(
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round
        )
        val iconOns = arrayOf(
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round

        )

        IndicatorZoom(
            this,
            mDataBinding.viewPager,
            titles,
            iconOffs,
            iconOns
        )


    }

    override fun initData() {
        DRouter.register(
            ServiceKey.build(IPageRouter::class.java).setAlias(aliasRouter)
                .setLifecycleOwner(this),
            pageRouter
        )
        commonNavigator.create(mDataBinding.magicIndicator)
    }

    override fun createObserver() {

    }


}