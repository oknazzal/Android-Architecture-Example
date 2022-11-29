package com.oknazzal.architecture.example.feature.authentication.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.LoginUseCase
import com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val isValidLoginFormUseCase: IsValidLoginFormUseCase,
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _validationData = MutableLiveData<IsValidLoginFormUseCase.FormValidationResult>()
    val validationData: LiveData<IsValidLoginFormUseCase.FormValidationResult> = _validationData

    private val _loginEvent = MutableLiveData<Unit>()
    val loginEvent: LiveData<Unit> = _loginEvent

    fun loginUser(email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val validationResult = isValidLoginFormUseCase(password, email)
            _validationData.postValue(validationResult)

            if (validationResult.isAllValid()) {
                loginUseCase(email, password)
                _loginEvent.postValue(Unit)
            }
        }
    }
}
