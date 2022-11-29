package com.oknazzal.architecture.example.feature.images.presentation.list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/ImagesListViewModel;", "Landroidx/lifecycle/ViewModel;", "getListOfImagesUseCase", "Lcom/oknazzal/architecture/example/feature/images/domain/usecase/GetListOfImagesUseCase;", "(Lcom/oknazzal/architecture/example/feature/images/domain/usecase/GetListOfImagesUseCase;)V", "_imagesData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagingData;", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "_progressData", "", "kotlin.jvm.PlatformType", "imagesData", "Landroidx/lifecycle/LiveData;", "getImagesData", "()Landroidx/lifecycle/LiveData;", "progressData", "getProgressData", "getImages", "", "presentation_debug"})
public final class ImagesListViewModel extends androidx.lifecycle.ViewModel {
    private final com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase getListOfImagesUseCase = null;
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel>> _imagesData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel>> imagesData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _progressData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> progressData = null;
    
    @javax.inject.Inject()
    public ImagesListViewModel(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase getListOfImagesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel>> getImagesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressData() {
        return null;
    }
    
    private final void getImages() {
    }
}