package com.example.lessontasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.example.lessontasks.adapter.ViewPagerAdapterTask5
import com.example.lessontasks.fragments.Task5_one_Fragment
import com.example.lessontasks.fragments.Task5_three_Fragment
import com.example.lessontasks.fragments.Task5_two_Fragment
import com.google.android.material.tabs.TabLayout

class Task5Activity : AppCompatActivity() {

    private var viewPagerAdapter:ViewPagerAdapterTask5? = null
    private var viewPager:ViewPager? = null
    private var tabLayout:TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task5)
        initViews()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewPager_task5)
        viewPagerAdapter = ViewPagerAdapterTask5(supportFragmentManager)
        viewPagerAdapter!!.add(Task5_one_Fragment(),"Page 1")
        viewPagerAdapter!!.add(Task5_two_Fragment(),"Pege 2")
        viewPagerAdapter!!.add(Task5_three_Fragment(),"Page 3")
        with(viewPager){
            this?.setAdapter(viewPagerAdapter)
        }
        tabLayout = findViewById(R.id.tab_layout_task5)
        with(tabLayout){
            this?.setupWithViewPager(viewPager)
        }
    }
}