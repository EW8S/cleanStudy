package com.ew8s.cleandemo.cleandemo.data.repository

import com.ew8s.cleandemo.cleandemo.data.local.UserDao
import com.ew8s.cleandemo.cleandemo.data.remote.GitHubService
import com.ew8s.cleandemo.cleandemo.domain.repository.MyRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MyRepositoryImpl @Inject constructor(
    private val remoteData: GitHubService,
    private val localData: UserDao
): MyRepository {
    override suspend fun getData() {
        remoteData.listRepos("123")
    }
}