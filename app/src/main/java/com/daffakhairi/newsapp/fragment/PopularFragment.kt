package com.daffakhairi.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daffakhairi.newsapp.data.DataNews
import com.daffakhairi.newsapp.adapter.NewsAdapter
import com.daffakhairi.newsapp.R
import com.daffakhairi.newsapp.initNewsHeadline

class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container , false)
        val rvPopularNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvPopularNews.layoutManager = LinearLayoutManager(view.context)
        rvPopularNews.adapter = NewsAdapter(DataNews.dataPopularNews)

        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initNewsHeadline(view.context, newsHeadline, 2)
        return view
    }
}