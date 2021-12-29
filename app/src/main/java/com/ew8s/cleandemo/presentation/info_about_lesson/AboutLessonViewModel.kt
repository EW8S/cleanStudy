package com.ew8s.cleandemo.presentation.info_about_lesson

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecase.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AboutLessonViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) : ViewModel() {
    // TODO: Implement the ViewModel
}