package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086\u0002\u00a8\u0006\b"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidPasswordUseCase;", "", "()V", "invoke", "", "password", "", "Companion", "domain_debug"})
public final class IsValidPasswordUseCase {
    @org.jetbrains.annotations.NotNull()
    public static final com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation.IsValidPasswordUseCase.Companion Companion = null;
    private static final int MAX_PASSWORD_LENGTH = 12;
    private static final int MIN_PASSWORD_LENGTH = 6;
    
    @javax.inject.Inject()
    public IsValidPasswordUseCase() {
        super();
    }
    
    public final boolean invoke(@org.jetbrains.annotations.Nullable()
    java.lang.String password) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/oknazzal/architecture/example/feature/authentication/domain/usecase/validation/IsValidPasswordUseCase$Companion;", "", "()V", "MAX_PASSWORD_LENGTH", "", "MIN_PASSWORD_LENGTH", "domain_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}