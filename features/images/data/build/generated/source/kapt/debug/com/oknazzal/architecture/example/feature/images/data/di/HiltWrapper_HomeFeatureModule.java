package com.oknazzal.architecture.example.feature.images.data.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = HomeFeatureModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = HomeFeatureModule.class
)
public final class HiltWrapper_HomeFeatureModule {
}
