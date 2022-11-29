package com.oknazzal.architecture.example.feature.authentication.data.di

import com.oknazzal.architecture.example.feature.authentication.data.AuthenticationRepositoryImpl
import com.oknazzal.architecture.example.feature.authentication.domain.AuthenticationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal interface AuthenticationFeatureModule {

    @Binds
    fun bindAuthenticationRepository(impl: AuthenticationRepositoryImpl): AuthenticationRepository

}
