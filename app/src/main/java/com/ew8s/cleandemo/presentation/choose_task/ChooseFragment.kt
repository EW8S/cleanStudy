package com.ew8s.cleandemo.presentation.choose_task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ew8s.cleandemo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChooseFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseFragment()
    }

    private val viewModel: ChooseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.choose_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Use the ViewModel
        viewModel.start()


    }

}