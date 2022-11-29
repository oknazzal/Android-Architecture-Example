package com.oknazzal.architecture.example.feature.images.data.di

import com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create

@InstallIn(SingletonComponent::class)
@Module
internal object ImagesRemoteModule {

    @Provides
    fun providePixabayImagesRemoteDataSource(retrofit: Retrofit): PixabayImagesRemoteDataSource {
        return retrofit.create()
    }
}
