package com.example.givemepass.viewpagerdemo

import android.content.Context
import android.widget.RelativeLayout

abstract class PageView(context: Context) : RelativeLayout(context) {
    abstract fun refreshView()
}
