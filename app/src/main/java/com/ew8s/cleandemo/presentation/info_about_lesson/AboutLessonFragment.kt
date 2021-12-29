package com.ew8s.cleandemo.presentation.info_about_lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ew8s.cleandemo.cleandemo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutLessonFragment : Fragment() {

    companion object {
        fun newInstance() = AboutLessonFragment()
    }

    private val viewModel by viewModels<AboutLessonViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_lesson_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Use the ViewModel
        //viewModel.start()


    }

}