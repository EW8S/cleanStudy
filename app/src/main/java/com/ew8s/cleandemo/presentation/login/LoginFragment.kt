package com.ew8s.cleandemo.presentation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ew8s.cleandemo.R

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment: Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val viewModel by viewModels<LoginViewModel>()

    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var checkRemember: CheckBox


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel = ViewModelProvider(this)[LoginViewModel::class.java]

        login = view.findViewById(R.id.il_login)
        password = view.findViewById(R.id.il_password)
        checkRemember = view.findViewById(R.id.cb_remember)

        // TODO: Use the ViewModel

        viewModel.checkIsRemember()

        view.findViewById<Button>(R.id.login_btn).setOnClickListener {
            viewModel.check(
                login.text.toString(),
                password.text.toString(),
                checkRemember.isChecked
            )
        }

        view.findViewById<TextView>(R.id.tv_restore_login).setOnClickListener {
            viewModel.restore()
        }

        viewModel.getData()

    }

}