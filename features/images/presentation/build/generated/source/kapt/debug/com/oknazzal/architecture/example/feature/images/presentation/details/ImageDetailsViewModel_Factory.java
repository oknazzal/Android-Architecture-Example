// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.images.presentation.details;

import com.oknazzal.architecture.example.feature.images.domain.usecase.GetImageByIdUseCase;
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
public final class ImageDetailsViewModel_Factory implements Factory<ImageDetailsViewModel> {
  private final Provider<GetImageByIdUseCase> getImageByIdUseCaseProvider;

  public ImageDetailsViewModel_Factory(Provider<GetImageByIdUseCase> getImageByIdUseCaseProvider) {
    this.getImageByIdUseCaseProvider = getImageByIdUseCaseProvider;
  }

  @Override
  public ImageDetailsViewModel get() {
    return newInstance(getImageByIdUseCaseProvider.get());
  }

  public static ImageDetailsViewModel_Factory create(
      Provider<GetImageByIdUseCase> getImageByIdUseCaseProvider) {
    return new ImageDetailsViewModel_Factory(getImageByIdUseCaseProvider);
  }

  public static ImageDetailsViewModel newInstance(GetImageByIdUseCase getImageByIdUseCase) {
    return new ImageDetailsViewModel(getImageByIdUseCase);
  }
}