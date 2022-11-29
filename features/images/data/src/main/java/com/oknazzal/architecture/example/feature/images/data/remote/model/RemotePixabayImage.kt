package com.oknazzal.architecture.example.feature.images.data.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class RemotePixabayImage(
    @Json(name = "id")
    val id: Long?,
    @Json(name = "type")
    val type: String?,
    @Json(name = "tags")
    val tags: String?,
    @Json(name = "previewURL")
    val previewURL: String?,
    @Json(name = "largeImageURL")
    val largeImageURL: String?,
    @Json(name = "imageSize")
    val imageSize: Int?,
    @Json(name = "views")
    val views: Int?,
    @Json(name = "likes")
    val likes: Int?,
    @Json(name = "comments")
    val comments: Int?,
    @Json(name = "downloads")
    val downloads: Int?,
    @Json(name = "user")
    val user: String?,
    @Json(name = "userImageURL")
    val userImageURL: String?,
)
