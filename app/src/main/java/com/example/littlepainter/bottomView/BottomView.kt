package com.example.littlepainter.bottomView

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.annotation.Dimension
import com.google.android.material.internal.ViewUtils.dpToPx

class BottomView(context:Context,attrs:AttributeSet):ViewGroup(context, attrs) {
    @SuppressLint("RestrictedApi")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val mmmm=MeasureSpec.getSize(widthMeasureSpec)
        val dddd=dpToPx(context,64).toInt()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    }
    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {

    }
}