package com.oknazzal.architecture.example.feature.authentication.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/data/di/AuthenticationFeatureModule;", "", "bindAuthenticationRepository", "Lcom/oknazzal/architecture/example/feature/authentication/domain/AuthenticationRepository;", "impl", "Lcom/oknazzal/architecture/example/feature/authentication/data/AuthenticationRepositoryImpl;", "data_debug"})
@dagger.Module()
public abstract interface AuthenticationFeatureModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.oknazzal.architecture.example.feature.authentication.domain.AuthenticationRepository bindAuthenticationRepository(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.data.AuthenticationRepositoryImpl impl);
}