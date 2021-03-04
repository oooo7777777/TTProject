package com.zlzw.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.zlzw.common.R;


public class ClassicsHeader extends LinearLayout implements RefreshHeader
{


    public ClassicsHeader(Context context)
    {
        super(context);
        this.initView(context);
    }

    public ClassicsHeader(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.initView(context);
    }

    public ClassicsHeader(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        this.initView(context);
    }

    private void initView(Context context)
    {
        setGravity(Gravity.CENTER);
        LayoutInflater.from(context).inflate(R.layout.app_header, this, true);
    }

    @NonNull
    public View getView()
    {
        return this;
    }

    @Override
    public SpinnerStyle getSpinnerStyle()
    {
        return SpinnerStyle.Translate;
    }

    @Override
    public void onStartAnimator(RefreshLayout layout, int headHeight, int maxDragHeight)
    {
    }

    @Override
    public int onFinish(RefreshLayout layout, boolean success)
    {
        return 0;
    }

    @Override
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState oldState, RefreshState newState)
    {
    }

    @Override
    public boolean isSupportHorizontalDrag()
    {
        return false;
    }

    @Override
    public void onInitialized(RefreshKernel kernel, int height, int maxDragHeight)
    {
    }

    @Override
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight)
    {

    }

    @Override
    public void onReleased(@NonNull RefreshLayout refreshLayout, int height, int maxDragHeight)
    {

    }

    @Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax)
    {
    }

    @Override
    public void setPrimaryColors(@ColorInt int... colors)
    {
    }
}