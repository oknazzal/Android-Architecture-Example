package com.oknazzal.architecture.example.feature.images.domain.model

data class ImageModel(
    val id: Long? = null,
    val type: String? = null,
    val tags: String? = null,
    val previewURL: String? = null,
    val largeImageURL: String? = null,
    val imageSize: Int? = null,
    val views: Int? = null,
    val likes: Int? = null,
    val comments: Int? = null,
    val downloads: Int? = null,
    val user: String? = null,
    val userImageURL: String? = null,
)
