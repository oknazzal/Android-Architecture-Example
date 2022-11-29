package com.oknazzal.architecture.example.feature.images.data.di

import com.oknazzal.architecture.example.feature.images.data.ImagesRepositoryImpl
import com.oknazzal.architecture.example.feature.images.domain.ImagesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal interface HomeFeatureModule {

    @Binds
    fun bindImagesRepository(impl: ImagesRepositoryImpl): ImagesRepository
}
