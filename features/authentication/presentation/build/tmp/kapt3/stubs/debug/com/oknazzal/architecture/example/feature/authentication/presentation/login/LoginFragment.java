package com.oknazzal.architecture.example.feature.authentication.presentation.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/presentation/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/oknazzal/architecture/example/feature/authentication/presentation/databinding/FragmentLoginBinding;", "viewModel", "Lcom/oknazzal/architecture/example/feature/authentication/presentation/login/LoginViewModel;", "getViewModel", "()Lcom/oknazzal/architecture/example/feature/authentication/presentation/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleEmailValidation", "", "isValidEmail", "", "handleLoginEvents", "result", "(Lkotlin/Unit;)V", "handlePasswordValidation", "isValidPassword", "handleValidation", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase$FormValidationResult;", "initListeners", "initObservers", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends androidx.fragment.app.Fragment {
    private com.oknazzal.architecture.example.feature.authentication.presentation.databinding.FragmentLoginBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public LoginFragment() {
        super();
    }
    
    private final com.oknazzal.architecture.example.feature.authentication.presentation.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListeners() {
    }
    
    private final void initObservers() {
    }
    
    private final void handleValidation(com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult result) {
    }
    
    private final void handleLoginEvents(kotlin.Unit result) {
    }
    
    private final void handleEmailValidation(boolean isValidEmail) {
    }
    
    private final void handlePasswordValidation(boolean isValidPassword) {
    }
}