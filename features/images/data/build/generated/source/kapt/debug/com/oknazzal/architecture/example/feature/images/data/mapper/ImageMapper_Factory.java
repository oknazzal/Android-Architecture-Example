// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.images.data.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImageMapper_Factory implements Factory<ImageMapper> {
  @Override
  public ImageMapper get() {
    return newInstance();
  }

  public static ImageMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ImageMapper newInstance() {
    return new ImageMapper();
  }

  private static final class InstanceHolder {
    private static final ImageMapper_Factory INSTANCE = new ImageMapper_Factory();
  }
}
