package com.oknazzal.architecture.example.feature.authentication.presentation.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/presentation/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "isValidRegisterFormUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidRegisterFormUseCase;", "registerUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/local/RegisterUseCase;", "(Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidRegisterFormUseCase;Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/local/RegisterUseCase;)V", "_registerEvent", "Landroidx/lifecycle/MutableLiveData;", "", "_validationFlow", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidRegisterFormUseCase$FormValidationResult;", "registerEvent", "Landroidx/lifecycle/LiveData;", "getRegisterEvent", "()Landroidx/lifecycle/LiveData;", "validationFlow", "getValidationFlow", "register", "age", "", "email", "name", "password", "presentation_debug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase isValidRegisterFormUseCase = null;
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.RegisterUseCase registerUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase.FormValidationResult> _validationFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase.FormValidationResult> validationFlow = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> _registerEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> registerEvent = null;
    
    @javax.inject.Inject()
    public RegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase isValidRegisterFormUseCase, @org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.RegisterUseCase registerUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase.FormValidationResult> getValidationFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getRegisterEvent() {
        return null;
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    java.lang.String age, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}