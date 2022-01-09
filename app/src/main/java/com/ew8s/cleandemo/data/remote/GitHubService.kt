package com.ew8s.cleandemo.data.remote

import com.ew8s.cleandemo.data.remote.model.Lessons
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
//    @GET("users/{user}/repos")
//    suspend fun listRepos(@Path("user") user: String?): Response<Repos>
//
//    @GET("test.php")
//    suspend fun listReposTest(): Response<Repos>

    @GET("lesson1.json")
    suspend fun getLessons(): Response<Lessons>

}