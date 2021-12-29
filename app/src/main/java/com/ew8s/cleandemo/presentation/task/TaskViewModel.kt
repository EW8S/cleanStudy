package com.ew8s.cleandemo.presentation.task

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecase.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(private val sampleUseCase: SampleUseCase): ViewModel() {

}