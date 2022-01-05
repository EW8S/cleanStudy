package com.ew8s.cleandemo.presentation.info_about_lesson

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecases.GetAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AboutLessonViewModel @Inject constructor(private val sampleUseCase: GetAllUseCase) : ViewModel() {
    // TODO: Implement the ViewModel
}