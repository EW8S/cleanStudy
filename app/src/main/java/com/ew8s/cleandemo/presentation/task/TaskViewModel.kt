package com.ew8s.cleandemo.presentation.task

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecases.GetAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(private val sampleUseCase: GetAllUseCase): ViewModel() {

}