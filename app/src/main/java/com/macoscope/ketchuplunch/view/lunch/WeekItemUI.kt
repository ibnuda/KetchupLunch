package com.macoscope.ketchuplunch.view.lunch

import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import com.macoscope.ketchuplunch.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.dip
import org.jetbrains.anko.singleLine
import org.jetbrains.anko.textView

class WeekItemUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {
            textView {
                id = R.id.week_name
                singleLine = true
                ellipsize = TextUtils.TruncateAt.END
                textSize = 18f
                height = dip(40f)
                gravity = Gravity.CENTER_VERTICAL
                setPadding(dip(8f), 0, dip(8f), 0)
            }
        }
    }
}