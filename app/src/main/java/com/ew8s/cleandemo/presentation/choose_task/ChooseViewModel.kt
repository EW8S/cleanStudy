package com.ew8s.cleandemo.presentation.choose_task

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecases.GetAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChooseViewModel @Inject constructor(private val sampleUseCase: GetAllUseCase) : ViewModel() {
    fun start() {
        //sampleUseCase.go()
        //println("132")
    }


}