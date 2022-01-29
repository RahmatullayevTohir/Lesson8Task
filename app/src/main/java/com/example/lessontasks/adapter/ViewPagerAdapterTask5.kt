package com.example.lessontasks.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapterTask5(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager) {

    private val fragments: MutableList<Fragment> = ArrayList()
    private var fragmentTitle:MutableList<String> = ArrayList()

    fun add(fragment:Fragment,title:String){
        fragments.add(fragment)
        fragmentTitle.add(title)

    }
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle[position]
    }
}