// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.images.data.di;

import com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImagesRemoteModule_ProvidePixabayImagesRemoteDataSourceFactory implements Factory<PixabayImagesRemoteDataSource> {
  private final Provider<Retrofit> retrofitProvider;

  public ImagesRemoteModule_ProvidePixabayImagesRemoteDataSourceFactory(
      Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PixabayImagesRemoteDataSource get() {
    return providePixabayImagesRemoteDataSource(retrofitProvider.get());
  }

  public static ImagesRemoteModule_ProvidePixabayImagesRemoteDataSourceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ImagesRemoteModule_ProvidePixabayImagesRemoteDataSourceFactory(retrofitProvider);
  }

  public static PixabayImagesRemoteDataSource providePixabayImagesRemoteDataSource(
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ImagesRemoteModule.INSTANCE.providePixabayImagesRemoteDataSource(retrofit));
  }
}