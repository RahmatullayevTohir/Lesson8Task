package com.example.lessontasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.lessontasks.adapter.ViewPagerAdapter
import com.example.lessontasks.fragments.PageOne
import com.example.lessontasks.fragments.PageTwo
import com.google.android.material.tabs.TabLayout

class Task4Activity : AppCompatActivity() {
    private var pagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)
        initViews()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter!!.add(PageOne(), "Page 1")
        pagerAdapter!!.add(PageTwo(), "Page 2")
        with(viewPager) { this?.setAdapter(pagerAdapter) }
        tabLayout = findViewById(R.id.tab_layout)
        with(tabLayout) { this?.setupWithViewPager(viewPager) }
    }
}