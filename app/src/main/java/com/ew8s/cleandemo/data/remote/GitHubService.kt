package com.ew8s.cleandemo.data.remote

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user: String?): Response<Repos>

    @GET("test.php")
    suspend fun listReposTest(): Response<Repos>

}