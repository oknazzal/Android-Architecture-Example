package com.oknazzal.architecture.example.feature.images.presentation.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/details/ImageDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getImageByIdUseCase", "Lcom/oknazzal/architecture/example/feature/images/domain/usecase/GetImageByIdUseCase;", "(Lcom/oknazzal/architecture/example/feature/images/domain/usecase/GetImageByIdUseCase;)V", "_imagesData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "_progressData", "", "kotlin.jvm.PlatformType", "imagesData", "Landroidx/lifecycle/LiveData;", "getImagesData", "()Landroidx/lifecycle/LiveData;", "progressData", "getProgressData", "getImageById", "", "imageId", "", "presentation_debug"})
public final class ImageDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.oknazzal.architecture.example.feature.images.domain.usecase.GetImageByIdUseCase getImageByIdUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> _imagesData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> imagesData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progressData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> progressData = null;
    
    @javax.inject.Inject()
    public ImageDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.images.domain.usecase.GetImageByIdUseCase getImageByIdUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> getImagesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressData() {
        return null;
    }
    
    public final void getImageById(long imageId) {
    }
}