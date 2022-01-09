package com.ew8s.cleandemo.data.repository

import com.ew8s.cleandemo.data.local.model.LessonsLocal
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
            //Список уроков и дата обновления из Room
            val loc = localData.getAll()
            println(loc)
            //Запрос на сервер
            val remote = remoteData.getLessons()
            //Ответ 200
            if(remote.isSuccessful){
                //Если тело ответа не null
                remote.body()?.let {
                    localData.insertAll(LessonsLocal(timetamp = it.timestamp, lessons = it.lessons))
                }
                println("OK")
            } else{
                println("FUCK")
            }
        } catch (e:Exception){
            println("Exception in mwRepository - $e")
        }

    }
}