package com.oknazzal.architecture.example.feature.authentication.presentation.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase
import com.oknazzal.architecture.example.feature.authentication.presentation.R
import com.oknazzal.architecture.example.feature.authentication.presentation.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initObservers()
    }

    private fun initListeners() {
        binding.buttonRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.buttonLogin.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()
            viewModel.loginUser(email, password)
        }
    }

    private fun initObservers() {
        viewModel.validationData.observe(viewLifecycleOwner, ::handleValidation)
        viewModel.loginEvent.observe(viewLifecycleOwner, ::handleLoginEvents)
    }

    private fun handleValidation(result: IsValidLoginFormUseCase.FormValidationResult) {
        handlePasswordValidation(result.isValidPassword)
        handleEmailValidation(result.isValidEmail)
    }

    private fun handleLoginEvents(result: Unit) {
        startActivity(Intent("com.oknazzal.images.LIST"))
    }

    private fun handleEmailValidation(isValidEmail: Boolean) {
        if (!isValidEmail) {
            binding.editTextEmail.error = "Email must be valid"
        } else {
            binding.editTextEmail.error = null
        }
    }

    private fun handlePasswordValidation(isValidPassword: Boolean) {
        if (!isValidPassword) {
            binding.editTextPassword.error = "Password should be between 6-12 number"
        } else {
            binding.editTextPassword.error = null
        }
    }
}
