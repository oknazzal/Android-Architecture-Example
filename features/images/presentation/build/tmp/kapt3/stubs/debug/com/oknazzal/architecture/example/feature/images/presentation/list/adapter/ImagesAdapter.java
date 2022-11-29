package com.oknazzal.architecture.example.feature.images.presentation.list.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0018\u0019B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "imageModel", "", "(Lkotlin/jvm/functions/Function1;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "presentation_debug"})
public final class ImagesAdapter extends androidx.paging.PagingDataAdapter<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel, com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel, kotlin.Unit> onItemClick = null;
    private android.view.LayoutInflater layoutInflater;
    @org.jetbrains.annotations.NotNull()
    public static final com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter.Companion Companion = null;
    
    public ImagesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.oknazzal.architecture.example.feature.images.domain.model.ImageModel, kotlin.Unit> onItemClick) {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/RowImageBinding;", "(Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter;Lcom/oknazzal/architecture/example/feature/images/presentation/databinding/RowImageBinding;)V", "bind", "", "selectorModel", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "presentation_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.oknazzal.architecture.example.feature.images.presentation.databinding.RowImageBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.oknazzal.architecture.example.feature.images.presentation.databinding.RowImageBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.oknazzal.architecture.example.feature.images.domain.model.ImageModel selectorModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter$Companion;", "", "()V", "DiffCallback", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/presentation/list/adapter/ImagesAdapter$Companion$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "presentation_debug"})
        static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> {
            @org.jetbrains.annotations.NotNull()
            public static final com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter.Companion.DiffCallback INSTANCE = null;
            
            private DiffCallback() {
                super();
            }
            
            @java.lang.Override()
            public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
            com.oknazzal.architecture.example.feature.images.domain.model.ImageModel oldItem, @org.jetbrains.annotations.NotNull()
            com.oknazzal.architecture.example.feature.images.domain.model.ImageModel newItem) {
                return false;
            }
            
            @java.lang.Override()
            public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
            com.oknazzal.architecture.example.feature.images.domain.model.ImageModel oldItem, @org.jetbrains.annotations.NotNull()
            com.oknazzal.architecture.example.feature.images.domain.model.ImageModel newItem) {
                return false;
            }
        }
    }
}