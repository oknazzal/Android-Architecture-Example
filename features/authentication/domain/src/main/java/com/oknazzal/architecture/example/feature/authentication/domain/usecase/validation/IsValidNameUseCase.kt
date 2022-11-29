package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import javax.inject.Inject

class IsValidNameUseCase @Inject constructor() {

    operator fun invoke(name: String?): Boolean {
        if (name == null) return false
        return name.length >= MIN_NAME_LENGTH
    }

    companion object {

        private const val MIN_NAME_LENGTH = 2
    }
}
