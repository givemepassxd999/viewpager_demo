package com.example.givemepass.viewpagerdemo

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView

class PageOneView(context: Context) : PageView(context) {
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.page_content, null)
        val textView = view.findViewById(R.id.text) as TextView
        textView.text = "Page one"
        addView(view)
    }

    override fun refreshView() {

    }
}
