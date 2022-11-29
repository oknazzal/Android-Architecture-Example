// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.images.presentation.list;

import com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase;
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
public final class ImagesListViewModel_Factory implements Factory<ImagesListViewModel> {
  private final Provider<GetListOfImagesUseCase> getListOfImagesUseCaseProvider;

  public ImagesListViewModel_Factory(
      Provider<GetListOfImagesUseCase> getListOfImagesUseCaseProvider) {
    this.getListOfImagesUseCaseProvider = getListOfImagesUseCaseProvider;
  }

  @Override
  public ImagesListViewModel get() {
    return newInstance(getListOfImagesUseCaseProvider.get());
  }

  public static ImagesListViewModel_Factory create(
      Provider<GetListOfImagesUseCase> getListOfImagesUseCaseProvider) {
    return new ImagesListViewModel_Factory(getListOfImagesUseCaseProvider);
  }

  public static ImagesListViewModel newInstance(GetListOfImagesUseCase getListOfImagesUseCase) {
    return new ImagesListViewModel(getListOfImagesUseCase);
  }
}