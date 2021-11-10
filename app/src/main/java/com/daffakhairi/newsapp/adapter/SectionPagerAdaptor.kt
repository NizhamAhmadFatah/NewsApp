package com.daffakhairi.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.daffakhairi.newsapp.fragment.AllNewsFragment
import com.daffakhairi.newsapp.fragment.PopularFragment
import com.daffakhairi.newsapp.fragment.TopFragment

class SectionPagerAdaptor(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllNewsFragment()
            1 -> TopFragment()
            2 -> PopularFragment()
            else -> AllNewsFragment()
        }
    }

}
