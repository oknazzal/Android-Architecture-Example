package com.oknazzal.architecture.example.feature.images.presentation.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/ImagesListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter;", "binding", "Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/ActivityImagesListBinding;", "getBinding", "()Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/ActivityImagesListBinding;", "binding$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/oknazzal/architecture/example/feature/images/presentation/list/ImagesListViewModel;", "getViewModel", "()Lcom/oknazzal/architecture/example/feature/images/presentation/list/ImagesListViewModel;", "viewModel$delegate", "handleContent", "", "images", "Landroidx/paging/PagingData;", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "handleItemClick", "imageModel", "handleProgress", "show", "", "initAdapter", "initListeners", "initObservers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ImagesListActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter adapter;
    
    public ImagesListActivity() {
        super();
    }
    
    private final com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImagesListBinding getBinding() {
        return null;
    }
    
    private final com.oknazzal.architecture.example.feature.images.presentation.list.ImagesListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListeners() {
    }
    
    private final void initAdapter() {
    }
    
    private final void initObservers() {
    }
    
    private final void handleContent(androidx.paging.PagingData<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> images) {
    }
    
    private final void handleProgress(boolean show) {
    }
    
    private final void handleItemClick(com.oknazzal.architecture.example.feature.images.domain.model.ImageModel imageModel) {
    }
}