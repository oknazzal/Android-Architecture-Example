package com.oknazzal.architecture.example.feature.images.data.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = ImagesRemoteModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = ImagesRemoteModule.class
)
public final class HiltWrapper_ImagesRemoteModule {
}
