package com.oknazzal.architecture.example.feature.authentication.data

import com.oknazzal.architecture.example.feature.authentication.domain.AuthenticationRepository
import javax.inject.Inject

internal class AuthenticationRepositoryImpl @Inject constructor() : AuthenticationRepository {

    override suspend fun login(email: String, password: String) {
        // Mock method
    }

    override suspend fun register(email: String, password: String, age: String) {
        // Mock method
    }
}
