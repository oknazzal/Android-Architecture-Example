package com.oknazzal.architecture.example.feature.images.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/data/ImagesRepositoryImpl;", "Lcom/oknazzal/architecture/example/feature/images/domain/ImagesRepository;", "imagesRemoteDataSource", "Lcom/oknazzal/architecture/example/feature/images/data/remote/PixabayImagesRemoteDataSource;", "imageMapper", "Lcom/oknazzal/architecture/example/feature/images/data/mapper/ImageMapper;", "(Lcom/oknazzal/architecture/example/feature/images/data/remote/PixabayImagesRemoteDataSource;Lcom/oknazzal/architecture/example/feature/images/data/mapper/ImageMapper;)V", "getImageById", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "imageId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "", "nextPage", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class ImagesRepositoryImpl implements com.oknazzal.architecture.example.feature.images.domain.ImagesRepository {
    private final com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource imagesRemoteDataSource = null;
    private final com.oknazzal.architecture.example.feature.images.data.mapper.ImageMapper imageMapper = null;
    
    @javax.inject.Inject()
    public ImagesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource imagesRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.oknazzal.architecture.example.feature.images.data.mapper.ImageMapper imageMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImages(int nextPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImageById(long imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> continuation) {
        return null;
    }
}