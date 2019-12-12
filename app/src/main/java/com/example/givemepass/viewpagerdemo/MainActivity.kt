package com.example.givemepass.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    private lateinit var pageList: MutableList<PageView>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }

    private fun initView() {
        pager.adapter = SamplePagerAdapter(pageList)
    }

    private fun initData() {
        pageList = ArrayList()
        pageList.add(PageOneView(this@MainActivity))
        pageList.add(PageTwoView(this@MainActivity))
        pageList.add(PageThreeView(this@MainActivity))
    }
}
