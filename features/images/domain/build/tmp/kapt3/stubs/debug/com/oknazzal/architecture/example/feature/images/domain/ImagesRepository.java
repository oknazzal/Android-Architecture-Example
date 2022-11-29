package com.oknazzal.architecture.example.feature.images.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/domain/ImagesRepository;", "", "getImageById", "Lcom/oknazzal/architecture/example/feature/images/domain/model/ImageModel;", "imageId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "", "nextPage", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface ImagesRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImages(int nextPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.oknazzal.architecture.example.feature.images.domain.model.ImageModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImageById(long imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.oknazzal.architecture.example.feature.images.domain.model.ImageModel> continuation);
}