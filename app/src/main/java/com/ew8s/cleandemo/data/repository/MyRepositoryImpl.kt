package com.ew8s.cleandemo.data.repository

import com.ew8s.cleandemo.data.local.UserDao
import com.ew8s.cleandemo.data.remote.GitHubService
import com.ew8s.cleandemo.domain.repository.MyRepository
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class MyRepositoryImpl @Inject constructor(
    private val remoteData: GitHubService,
    private val localData: UserDao
): MyRepository {
    override suspend fun getData() {
        try {
            val ren = remoteData.getLessons()

            if(ren.isSuccessful){
                ren.body()?.lessons?.forEach {
                    println(it.toString())
                }
                println("OK")
            } else{
                println("FUCK")
            }
        } catch (e:Exception){
            println("Exception")
        }

    }
}