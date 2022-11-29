package com.oknazzal.architecture.example.feature.authentication.data.di;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(
    topLevelClass = AuthenticationFeatureModule.class
)
@InstallIn(SingletonComponent.class)
@Module(
    includes = AuthenticationFeatureModule.class
)
public final class HiltWrapper_AuthenticationFeatureModule {
}
