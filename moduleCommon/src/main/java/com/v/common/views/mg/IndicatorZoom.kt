package  com.v.common.views.mg;

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.v.base.VBFragmentAdapter
import com.v.base.utils.vbOnClickListener
import com.v.common.R
import net.lucode.hackware.magicindicator.MagicIndicator
import net.lucode.hackware.magicindicator.ViewPagerHelper
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView
import java.util.*

/**
 * @Author : ww
 * desc    :
 * time    : 2021/12/16
 */
class IndicatorZoom(
    context: Context,
    val viewPager: ViewPager,
    titles: Array<String>,
    iconOffs: Array<Int>,
    iconOns: Array<Int>,
    fragments: ArrayList<Fragment>? = null,
) :
    CommonNavigator(context) {

    init {

        viewPager.offscreenPageLimit = titles.size

        if (fragments != null) {

            if (context is AppCompatActivity) {
                val fragmentAdapter =
                    VBFragmentAdapter(context.supportFragmentManager, fragments, titles)
                viewPager.adapter = fragmentAdapter

            } else if (context is Fragment) {

                context.childFragmentManager
                val fragmentAdapter =
                    VBFragmentAdapter(context.childFragmentManager, fragments, titles)
                viewPager.adapter = fragmentAdapter
            }

        }

        isAdjustMode = true
        adapter = object : CommonNavigatorAdapter() {
            override fun getCount(): Int {
                return if (titles.isEmpty()) 0 else titles.size
            }

            override fun getTitleView(context: Context, index: Int): IPagerTitleView? {

                val commonPagerTitleView = CommonPagerTitleView(context)

                val customLayout: View =
                    LayoutInflater.from(context).inflate(R.layout.view_tab, null)
                val titleImg = customLayout.findViewById<View>(R.id.ivIcon) as ImageView
                val titleText = customLayout.findViewById<View>(R.id.ivTitle) as TextView
                titleText.text = titles[index]
                titleImg.setImageResource(iconOffs[index])
                commonPagerTitleView.setContentView(customLayout)
                commonPagerTitleView.onPagerTitleChangeListener = object :
                    CommonPagerTitleView.OnPagerTitleChangeListener {
                    override fun onSelected(index: Int, totalCount: Int) {
                        titleText.setTextColor(Color.parseColor("#00BBFF"))
                        titleImg.setImageResource(iconOns[index])
                    }

                    override fun onDeselected(index: Int, totalCount: Int) {
                        titleText.setTextColor(Color.parseColor("#b3FFFFFF"))
                        titleImg.setImageResource(iconOffs[index])
                    }

                    override fun onLeave(
                        index: Int,
                        totalCount: Int,
                        leavePercent: Float,
                        leftToRight: Boolean,
                    ) {
                        titleImg.scaleX = 1.3f + (1f - 1.3f) * leavePercent
                        titleImg.scaleY = 1.3f + (1f - 1.3f) * leavePercent
                    }

                    override fun onEnter(
                        index: Int,
                        totalCount: Int,
                        enterPercent: Float,
                        leftToRight: Boolean,
                    ) {
                        titleImg.scaleX = 1f + (1.3f - 1f) * enterPercent
                        titleImg.scaleY = 1f + (1.3f - 1f) * enterPercent
                    }
                }

                commonPagerTitleView.vbOnClickListener {
                    viewPager.currentItem = index
                }
                return commonPagerTitleView
            }

            override fun getIndicator(context: Context?): IPagerIndicator? {
                return null
            }
        }

    }


    fun create(magicIndicator: MagicIndicator) {
        magicIndicator.navigator = this
        ViewPagerHelper.bind(magicIndicator, viewPager)
    }

}
