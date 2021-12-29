package com.ew8s.cleandemo.presentation.choose_task

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecase.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChooseViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) : ViewModel() {
    fun start() {
        sampleUseCase.go()
        //println("132")
    }


}