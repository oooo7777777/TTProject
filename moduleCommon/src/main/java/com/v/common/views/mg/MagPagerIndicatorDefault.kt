package com.v.common.views.mg

import android.content.Context
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.RectF
import android.graphics.Shader
import com.v.base.utils.vbDp2px
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator

class MagPagerIndicatorDefault(context: Context?) : LinePagerIndicator(context) {
    private val mLineRect = RectF()

    init {

        mode = MODE_EXACTLY
        lineWidth = 25.vbDp2px().toFloat()
        xOffset = 4.vbDp2px().toFloat()
        yOffset = 10.vbDp2px().toFloat()
        lineHeight = 5.vbDp2px().toFloat()
        roundRadius = 5.vbDp2px().toFloat()
        setColors(Color.parseColor("#FF5369"))
    }

    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        val linearGradient = LinearGradient(
            lineWidth / 2f, 0f,
            lineWidth, mLineRect.top / 3f,
            -0xac97, -0x6955,
            Shader.TileMode.MIRROR
        )
        paint.shader = linearGradient
    }
}