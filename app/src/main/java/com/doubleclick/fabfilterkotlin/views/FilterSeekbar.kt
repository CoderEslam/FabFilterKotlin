package com.doubleclick.fabfilterkotlin.views

import android.content.Context
import android.util.AttributeSet
import com.doubleclick.fabfilterkotlin.crystalrangeseekbar.widgets.CrystalRangeSeekbar

class FilterSeekbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CrystalRangeSeekbar(context, attrs, defStyleAttr) {

    override fun getThumbWidth(): Float = 40.toFloat()// resources.getDimension(R.dimen.thumb_size)
    override fun getThumbHeight(): Float =40.toFloat()// resources.getDimension(R.dimen.thumb_size)
    override fun getBarHeight(): Float = thumbHeight / 4.5f
}
