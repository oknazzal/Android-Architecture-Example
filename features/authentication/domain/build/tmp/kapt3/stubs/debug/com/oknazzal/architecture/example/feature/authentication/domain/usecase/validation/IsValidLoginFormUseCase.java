package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase;", "", "isValidPasswordUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidPasswordUseCase;", "isValidEmailUseCase", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidEmailUseCase;", "(Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidPasswordUseCase;Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidEmailUseCase;)V", "invoke", "Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase$FormValidationResult;", "password", "", "email", "FormValidationResult", "domain_debug"})
public final class IsValidLoginFormUseCase {
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidPasswordUseCase isValidPasswordUseCase = null;
    private final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidEmailUseCase isValidEmailUseCase = null;
    
    @javax.inject.Inject()
    public IsValidLoginFormUseCase(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidPasswordUseCase isValidPasswordUseCase, @org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidEmailUseCase isValidEmailUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult invoke(@org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidLoginFormUseCase$FormValidationResult;", "", "isValidPassword", "", "isValidEmail", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "isAllValid", "toString", "", "domain_debug"})
    public static final class FormValidationResult {
        private final boolean isValidPassword = false;
        private final boolean isValidEmail = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidLoginFormUseCase.FormValidationResult copy(boolean isValidPassword, boolean isValidEmail) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FormValidationResult(boolean isValidPassword, boolean isValidEmail) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isValidPassword() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isValidEmail() {
            return false;
        }
        
        public final boolean isAllValid() {
            return false;
        }
    }
}