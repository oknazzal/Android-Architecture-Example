package com.oknazzal.architecture.example.feature.images.presentation.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/details/ImageDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/ActivityImageDetailsBinding;", "getBinding", "()Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/ActivityImageDetailsBinding;", "binding$delegate", "Lkotlin/Lazy;", "imageId", "", "Ljava/lang/Long;", "viewModel", "Lcom/oknazzal/architecture/example/feature/images/presentation/details/ImageDetailsViewModel;", "getViewModel", "()Lcom/oknazzal/architecture/example/feature/images/presentation/details/ImageDetailsViewModel;", "viewModel$delegate", "handleContent", "", "image", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "handleProgress", "show", "", "initObservers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ImageDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.Long imageId;
    @org.jetbrains.annotations.NotNull()
    public static final com.oknazzal.architecture.example.feature.images.presentation.details.ImageDetailsActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_IMAGE_ID = "EXTRA_IMAGE_ID";
    
    public ImageDetailsActivity() {
        super();
    }
    
    private final com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImageDetailsBinding getBinding() {
        return null;
    }
    
    private final com.oknazzal.architecture.example.feature.images.presentation.details.ImageDetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initObservers() {
    }
    
    private final void handleContent(com.oknazzal.architecture.example.feature.images.domain.model.ImageModel image) {
    }
    
    private final void handleProgress(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/details/ImageDetailsActivity$Companion;", "", "()V", "EXTRA_IMAGE_ID", "", "start", "", "context", "Landroid/content/Context;", "imageId", "", "(Landroid/content/Context;Ljava/lang/Long;)V", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.Long imageId) {
        }
    }
}