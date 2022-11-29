package com.oknazzal.architecture.example.feature.authentication.presentation;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AuthenticationActivity.class
)
@GeneratedEntryPoint
@InstallIn(ActivityComponent.class)
public interface AuthenticationActivity_GeneratedInjector {
  void injectAuthenticationActivity(AuthenticationActivity authenticationActivity);
}
