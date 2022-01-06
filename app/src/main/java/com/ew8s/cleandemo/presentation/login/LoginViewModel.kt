package com.ew8s.cleandemo.presentation.login

import androidx.lifecycle.ViewModel
import com.ew8s.cleandemo.domain.usecases.GetAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val getAllUseCase: GetAllUseCase) : ViewModel() {

    fun getData(){
        CoroutineScope( Dispatchers.IO).launch {
            getAllUseCase.getAllData()
        }
    }


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
        //sampleUseCase.go()
    }

    fun check(login: String, password: String, checked: Boolean) {
        //navigation.value = FragmentEnum.ListTasks
    }

    fun restore() {

    }

}