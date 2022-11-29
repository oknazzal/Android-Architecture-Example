package com.oknazzal.architecture.example.feature.images.domain

import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel

interface ImagesRepository {

    suspend fun getImages(nextPage: Int): List<ImageModel>

    suspend fun getImageById(imageId: Long): ImageModel
}
