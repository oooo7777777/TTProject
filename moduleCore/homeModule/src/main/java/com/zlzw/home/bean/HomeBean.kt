package com.zlzw.home.bean

/**
 * author  :
 * desc    :
 * time    : 2021-04-26 16:20:49
 */
data class HomeBean(
    val `data`: List<HomeData>,
    val page: Int,
    val page_count: Int,
    val status: Int,
    val total_counts: Int
)

data class HomeData(
    val _id: String,
    val author: String,
    val category: String,
    val createdAt: String,
    val desc: String,
    val images: List<String>,
    val likeCounts: Int,
    val publishedAt: String,
    val stars: Int,
    val title: String,
    val type: String,
    val url: String,
    val views: Int
)