package com.oknazzal.architecture.example.feature.authentication.presentation.register

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase
import com.oknazzal.architecture.example.feature.authentication.presentation.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private val viewModel: RegisterViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initObservers()
    }

    private fun initListeners() {
        binding.buttonSubmit.setOnClickListener {
            val age = binding.editTextAge.text.toString()
            val email = binding.editTextEmail.text.toString()
            val name = binding.editTextName.text.toString()
            val password = binding.editTextPassword.text.toString()
            viewModel.register(
                age,
                email,
                name,
                password
            )
        }
    }

    private fun initObservers() {
        viewModel.validationFlow.observe(viewLifecycleOwner, ::handleValidation)
        viewModel.registerEvent.observe(viewLifecycleOwner, ::handleRegisterEvents)
    }

    private fun handleRegisterEvents(result: Unit) {
        startActivity(Intent("com.oknazzal.images.LIST"))
    }

    private fun handleValidation(result: IsValidRegisterFormUseCase.FormValidationResult) {
        handlePasswordValidation(result.isValidPassword)
        handleEmailValidation(result.isValidEmail)
        handleAgeValidation(result.isValidAge)
        handleNameValidation(result.isValidName)
    }

    private fun handleAgeValidation(isValidAge: Boolean) {
        if (!isValidAge) {
            binding.editTextAge.error = "Age must be valid"
        } else {
            binding.editTextAge.error = null
        }
    }

    private fun handleNameValidation(isValidName: Boolean) {
        if (!isValidName) {
            binding.editTextName.error = "Name must be valid"
        } else {
            binding.editTextName.error = null
        }
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
