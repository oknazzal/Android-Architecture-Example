package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import javax.inject.Inject

class IsValidRegisterFormUseCase @Inject constructor(
    private val isValidPasswordUseCase: IsValidPasswordUseCase,
    private val isValidEmailUseCase: IsValidEmailUseCase,
    private val isValidAgeUseCase: IsValidAgeUseCase,
    private val isValidNameUseCase: IsValidNameUseCase
) {

    operator fun invoke(
        password: String?,
        email: String?,
        age: String?,
        name: String?
    ): FormValidationResult {
        return FormValidationResult(
            isValidPassword = isValidPasswordUseCase(password),
            isValidEmail = isValidEmailUseCase(email),
            isValidAge = isValidAgeUseCase(age),
            isValidName = isValidNameUseCase(name),
        )
    }

    data class FormValidationResult(
        val isValidPassword: Boolean,
        val isValidEmail: Boolean,
        val isValidAge: Boolean,
        val isValidName: Boolean
    ) {

        fun isAllValid(): Boolean {
            return isValidPassword && isValidEmail && isValidAge && isValidName
        }
    }
}
