package com.daffakhairi.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.daffakhairi.newsapp.adapter.SectionPagerAdaptor
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // findviewbyid menghubungkan layout kita
        setSupportActionBar(findViewById(R.id.toolbar))

        val vpNews = findViewById<ViewPager2>(R.id.vp_news)
        vpNews.adapter = SectionPagerAdaptor(this)

        val tabs = findViewById<TabLayout>(R.id.tabs)

        val list = arrayOf("All News", "Top", "Popular")
        // bisa membuka halaman baru dengan mengeclick dan menggeser
        TabLayoutMediator(tabs, vpNews){ tab, posision ->
            tab.text = list[posision]
        }.attach()
    }
}