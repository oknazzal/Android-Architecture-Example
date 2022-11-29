package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import javax.inject.Inject

class IsValidAgeUseCase @Inject constructor() {

    operator fun invoke(age: String?): Boolean {
        if (age == null) return false
        return age.isNotEmpty()
    }
}
