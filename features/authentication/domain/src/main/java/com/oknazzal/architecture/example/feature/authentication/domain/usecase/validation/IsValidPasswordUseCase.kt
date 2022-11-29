package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import javax.inject.Inject

class IsValidPasswordUseCase @Inject constructor() {

    operator fun invoke(password: String?): Boolean {
        return password?.length in MIN_PASSWORD_LENGTH..MAX_PASSWORD_LENGTH
    }

    companion object {

        private const val MAX_PASSWORD_LENGTH = 12
        private const val MIN_PASSWORD_LENGTH = 6
    }
}
