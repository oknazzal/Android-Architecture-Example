package com.oknazzal.architecture.example.feature.images.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/oknazzal/architecture/example/feature/images/data/remote/PixabayImagesRemoteDataSource;", "", "getImageById", "", "Lcom/oknazzal/architecture/example/feature/images/data/remote/model/RemotePixabayImage;", "imageId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "nextPage", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface PixabayImagesRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    @com.serjltt.moshi.adapters.Wrapped(path = {"hits"})
    @retrofit2.http.GET(value = "api/")
    public abstract java.lang.Object getImages(@retrofit2.http.Query(value = "page")
    int nextPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.oknazzal.architecture.example.feature.images.data.remote.model.RemotePixabayImage>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @com.serjltt.moshi.adapters.Wrapped(path = {"hits"})
    @retrofit2.http.GET(value = "api/")
    public abstract java.lang.Object getImageById(@retrofit2.http.Query(value = "id")
    long imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.oknazzal.architecture.example.feature.images.data.remote.model.RemotePixabayImage>> continuation);
}