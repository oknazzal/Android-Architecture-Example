package com.oknazzal.architecture.example.feature.images.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/data/di/ImagesRemoteModule;", "", "()V", "providePixabayImagesRemoteDataSource", "Lcom/oknazzal/architecture/example/feature/images/data/remote/PixabayImagesRemoteDataSource;", "retrofit", "Lretrofit2/Retrofit;", "data_debug"})
@dagger.Module()
public final class ImagesRemoteModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.oknazzal.architecture.example.feature.images.data.di.ImagesRemoteModule INSTANCE = null;
    
    private ImagesRemoteModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource providePixabayImagesRemoteDataSource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}