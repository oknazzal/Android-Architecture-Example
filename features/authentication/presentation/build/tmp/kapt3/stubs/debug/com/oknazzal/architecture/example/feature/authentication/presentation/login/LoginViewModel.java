package com.oknazzal.architecture.example.feature.authentication.presentation.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "isValidLoginFormUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase;", "loginUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/local/LoginUseCase;", "(Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase;Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/local/LoginUseCase;)V", "_loginEvent", "Landroidx/lifecycle/MutableLiveData;", "", "_validationData", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase$FormValidationResult;", "loginEvent", "Landroidx/lifecycle/LiveData;", "getLoginEvent", "()Landroidx/lifecycle/LiveData;", "validationData", "getValidationData", "loginUser", "email", "", "password", "presentation_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase isValidLoginFormUseCase = null;
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.LoginUseCase loginUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult> _validationData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult> validationData = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> _loginEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> loginEvent = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase isValidLoginFormUseCase, @org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.local.LoginUseCase loginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult> getValidationData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getLoginEvent() {
        return null;
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
}