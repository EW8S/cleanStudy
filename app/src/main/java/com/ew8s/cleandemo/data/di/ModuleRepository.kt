package com.ew8s.cleandemo.data.di

import com.ew8s.cleandemo.data.local.UserDao
import com.ew8s.cleandemo.data.remote.GitHubService
import com.ew8s.cleandemo.data.repository.MyRepositoryImpl
import com.ew8s.cleandemo.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ModuleRepository {
    @Provides
    fun provideMyRepository(remoteData: GitHubService, localData: UserDao): MyRepository =
        MyRepositoryImpl(remoteData, localData)
}