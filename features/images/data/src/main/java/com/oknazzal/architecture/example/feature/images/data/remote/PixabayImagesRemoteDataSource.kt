package com.oknazzal.architecture.example.feature.images.data.remote

import com.oknazzal.architecture.example.feature.images.data.remote.model.RemotePixabayImage
import com.serjltt.moshi.adapters.Wrapped
import retrofit2.http.GET
import retrofit2.http.Query

internal interface PixabayImagesRemoteDataSource {

    @GET("api/")
    @Wrapped(path = ["hits"])
    suspend fun getImages(
        @Query("page") nextPage: Int
    ): List<RemotePixabayImage>

    @GET("api/")
    @Wrapped(path = ["hits"])
    suspend fun getImageById(
        @Query("id") imageId: Long
    ): List<RemotePixabayImage>
}
