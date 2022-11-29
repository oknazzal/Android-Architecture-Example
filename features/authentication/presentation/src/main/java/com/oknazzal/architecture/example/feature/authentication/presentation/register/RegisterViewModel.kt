package com.oknazzal.architecture.example.feature.authentication.presentation.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.RegisterUseCase
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val isValidRegisterFormUseCase: IsValidRegisterFormUseCase,
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    private val _validationFlow = MutableLiveData<IsValidRegisterFormUseCase.FormValidationResult>()
    val validationFlow: LiveData<IsValidRegisterFormUseCase.FormValidationResult> = _validationFlow

    private val _registerEvent = MutableLiveData<Unit>()
    val registerEvent: LiveData<Unit> = _registerEvent

    fun register(age: String, email: String, name: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val validationResult = isValidRegisterFormUseCase(password, email, age, name)
            _validationFlow.value = validationResult

            if (validationResult.isAllValid()) {
                registerUseCase(email, password, age)
                _registerEvent.value = Unit
            }
        }
    }
}
