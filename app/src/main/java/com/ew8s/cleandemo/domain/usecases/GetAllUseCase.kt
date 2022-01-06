package com.ew8s.cleandemo.domain.usecases

import com.ew8s.cleandemo.domain.repository.MyRepository
import javax.inject.Inject

class GetAllUseCase @Inject constructor(private val repository: MyRepository){
    suspend fun getAllData(){
        repository.getData()
    }
}