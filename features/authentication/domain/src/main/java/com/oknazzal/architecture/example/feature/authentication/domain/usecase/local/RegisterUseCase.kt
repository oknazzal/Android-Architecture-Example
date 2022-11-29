package com.oknazzal.architecture.example.feature.authentication.domain.usecase.local

import com.oknazzal.architecture.example.feature.authentication.domain.AuthenticationRepository
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val repository: AuthenticationRepository
) {

    suspend operator fun invoke(email: String, password: String, age: String) {
        repository.register(email, password, age)
    }
}
