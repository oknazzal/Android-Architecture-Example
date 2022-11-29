package com.oknazzal.architecture.example.feature.authentication.presentation.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006&"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/presentation/register/RegisterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/oknazzal/architecture/example/feature/authentication/presentation/databinding/FragmentRegisterBinding;", "viewModel", "Lcom/oknazzal/architecture/example/feature/authentication/presentation/register/RegisterViewModel;", "getViewModel", "()Lcom/oknazzal/architecture/example/feature/authentication/presentation/register/RegisterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleAgeValidation", "", "isValidAge", "", "handleEmailValidation", "isValidEmail", "handleNameValidation", "isValidName", "handlePasswordValidation", "isValidPassword", "handleRegisterEvents", "result", "(Lkotlin/Unit;)V", "handleValidation", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidRegisterFormUseCase$FormValidationResult;", "initListeners", "initObservers", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RegisterFragment extends androidx.fragment.app.Fragment {
    private com.oknazzal.architecture.example.feature.authentication.presentation.databinding.FragmentRegisterBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public RegisterFragment() {
        super();
    }
    
    private final com.oknazzal.architecture.example.feature.authentication.presentation.register.RegisterViewModel getViewModel() {
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
    
    private final void handleRegisterEvents(kotlin.Unit result) {
    }
    
    private final void handleValidation(com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidRegisterFormUseCase.FormValidationResult result) {
    }
    
    private final void handleAgeValidation(boolean isValidAge) {
    }
    
    private final void handleNameValidation(boolean isValidName) {
    }
    
    private final void handleEmailValidation(boolean isValidEmail) {
    }
    
    private final void handlePasswordValidation(boolean isValidPassword) {
    }
}