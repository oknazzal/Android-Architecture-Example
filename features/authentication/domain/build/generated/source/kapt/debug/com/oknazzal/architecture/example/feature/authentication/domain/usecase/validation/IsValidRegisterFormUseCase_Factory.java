// Generated by Dagger (https://dagger.dev).
package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation;

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
public final class IsValidRegisterFormUseCase_Factory implements Factory<IsValidRegisterFormUseCase> {
  private final Provider<IsValidPasswordUseCase> isValidPasswordUseCaseProvider;

  private final Provider<IsValidEmailUseCase> isValidEmailUseCaseProvider;

  private final Provider<IsValidAgeUseCase> isValidAgeUseCaseProvider;

  private final Provider<IsValidNameUseCase> isValidNameUseCaseProvider;

  public IsValidRegisterFormUseCase_Factory(
      Provider<IsValidPasswordUseCase> isValidPasswordUseCaseProvider,
      Provider<IsValidEmailUseCase> isValidEmailUseCaseProvider,
      Provider<IsValidAgeUseCase> isValidAgeUseCaseProvider,
      Provider<IsValidNameUseCase> isValidNameUseCaseProvider) {
    this.isValidPasswordUseCaseProvider = isValidPasswordUseCaseProvider;
    this.isValidEmailUseCaseProvider = isValidEmailUseCaseProvider;
    this.isValidAgeUseCaseProvider = isValidAgeUseCaseProvider;
    this.isValidNameUseCaseProvider = isValidNameUseCaseProvider;
  }

  @Override
  public IsValidRegisterFormUseCase get() {
    return newInstance(isValidPasswordUseCaseProvider.get(), isValidEmailUseCaseProvider.get(), isValidAgeUseCaseProvider.get(), isValidNameUseCaseProvider.get());
  }

  public static IsValidRegisterFormUseCase_Factory create(
      Provider<IsValidPasswordUseCase> isValidPasswordUseCaseProvider,
      Provider<IsValidEmailUseCase> isValidEmailUseCaseProvider,
      Provider<IsValidAgeUseCase> isValidAgeUseCaseProvider,
      Provider<IsValidNameUseCase> isValidNameUseCaseProvider) {
    return new IsValidRegisterFormUseCase_Factory(isValidPasswordUseCaseProvider, isValidEmailUseCaseProvider, isValidAgeUseCaseProvider, isValidNameUseCaseProvider);
  }

  public static IsValidRegisterFormUseCase newInstance(
      IsValidPasswordUseCase isValidPasswordUseCase, IsValidEmailUseCase isValidEmailUseCase,
      IsValidAgeUseCase isValidAgeUseCase, IsValidNameUseCase isValidNameUseCase) {
    return new IsValidRegisterFormUseCase(isValidPasswordUseCase, isValidEmailUseCase, isValidAgeUseCase, isValidNameUseCase);
  }
}
