package com.oknazzal.architecture.example.feature.authentication.domain

interface AuthenticationRepository {

    suspend fun login(email: String, password: String)

    suspend fun register(email: String, password: String, age: String)
}
