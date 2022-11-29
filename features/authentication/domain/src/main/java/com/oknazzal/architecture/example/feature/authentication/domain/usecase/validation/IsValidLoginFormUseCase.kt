package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import javax.inject.Inject

class IsValidLoginFormUseCase @Inject constructor(
    private val isValidPasswordUseCase: IsValidPasswordUseCase,
    private val isValidEmailUseCase: IsValidEmailUseCase
) {

    operator fun invoke(password: String?, email: String?): FormValidationResult {
        return FormValidationResult(
            isValidPassword = isValidPasswordUseCase(password),
            isValidEmail = isValidEmailUseCase(email),
        )
    }

    data class FormValidationResult(val isValidPassword: Boolean, val isValidEmail: Boolean) {

        fun isAllValid(): Boolean {
            return isValidPassword && isValidEmail
        }
    }
}
