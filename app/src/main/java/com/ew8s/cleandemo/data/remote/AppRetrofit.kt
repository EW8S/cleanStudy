package com.ew8s.cleandemo.cleandemo.data.remote

import retrofit2.Retrofit

class AppRetrofit {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build()

    var service = retrofit.create(GitHubService::class.java)
}