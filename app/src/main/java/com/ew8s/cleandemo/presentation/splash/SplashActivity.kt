package com.ew8s.cleandemo.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ew8s.cleandemo.R
import com.ew8s.cleandemo.presentation.choose_task.ChooseFragment
import com.ew8s.cleandemo.presentation.login.LoginFragment
import com.ew8s.cleandemo.presentation.task.TaskFragment
import com.ew8s.domain.model.FragmentEnum
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    fun replaceFragment(fragments: FragmentEnum){
        val fragment = when(fragments) {
            FragmentEnum.Login -> LoginFragment.newInstance()
            FragmentEnum.ChooseTasks -> ChooseFragment.newInstance()
            FragmentEnum.Task -> TaskFragment.newInstance()
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }
}