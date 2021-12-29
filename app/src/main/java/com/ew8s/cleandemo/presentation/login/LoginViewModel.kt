package com.ew8s.cleandemo.presentation.login

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecase.SampleUseCase
import com.ew8s.cleandemo.presentation.State
import com.ew8s.cleandemo.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) : ViewModel() {

    //val navigation = MutableLiveData<FragmentEnum>()

//    fun checkIsRemember() = flow {
//        emit(State.LoadingState)
//        try {
//            delay(1000)
//            emit(State.DataState(sampleUseCase()))
//        } catch (e: Exception) {
//            e.printStackTrace()
//            emit(Utils.resolveError(e))
//        }
//    }

    fun checkIsRemember() {
        sampleUseCase.go()
    }

    fun check(login: String, password: String, checked: Boolean) {
        //navigation.value = FragmentEnum.ListTasks
    }

    fun restore() {

    }

}