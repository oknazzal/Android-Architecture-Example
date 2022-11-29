package com.oknazzal.architecture.example.core.errorhandler.di

import com.oknazzal.architecture.example.core.errorhandler.ErrorHandler
import com.oknazzal.architecture.example.core.errorhandler.handlers.NetworkErrorHandler
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface ErrorHandlerModule {

    @Binds
    @Network
    fun bindNetworkErrorHandler(networkErrorHandler: NetworkErrorHandler): ErrorHandler
}
