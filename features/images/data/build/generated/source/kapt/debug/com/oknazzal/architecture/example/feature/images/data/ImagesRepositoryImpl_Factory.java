// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.images.data;

import com.oknazzal.architecture.example.feature.images.data.mapper.ImageMapper;
import com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImagesRepositoryImpl_Factory implements Factory<ImagesRepositoryImpl> {
  private final Provider<PixabayImagesRemoteDataSource> imagesRemoteDataSourceProvider;

  private final Provider<ImageMapper> imageMapperProvider;

  public ImagesRepositoryImpl_Factory(
      Provider<PixabayImagesRemoteDataSource> imagesRemoteDataSourceProvider,
      Provider<ImageMapper> imageMapperProvider) {
    this.imagesRemoteDataSourceProvider = imagesRemoteDataSourceProvider;
    this.imageMapperProvider = imageMapperProvider;
  }

  @Override
  public ImagesRepositoryImpl get() {
    return newInstance(imagesRemoteDataSourceProvider.get(), imageMapperProvider.get());
  }

  public static ImagesRepositoryImpl_Factory create(
      Provider<PixabayImagesRemoteDataSource> imagesRemoteDataSourceProvider,
      Provider<ImageMapper> imageMapperProvider) {
    return new ImagesRepositoryImpl_Factory(imagesRemoteDataSourceProvider, imageMapperProvider);
  }

  public static ImagesRepositoryImpl newInstance(
      PixabayImagesRemoteDataSource imagesRemoteDataSource, ImageMapper imageMapper) {
    return new ImagesRepositoryImpl(imagesRemoteDataSource, imageMapper);
  }
}
