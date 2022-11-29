package com.oknazzal.architecture.example.feature.images.data

import com.oknazzal.architecture.example.feature.images.data.mapper.ImageMapper
import com.oknazzal.architecture.example.feature.images.data.remote.PixabayImagesRemoteDataSource
import com.oknazzal.architecture.example.feature.images.domain.ImagesRepository
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import javax.inject.Inject

internal class ImagesRepositoryImpl @Inject constructor(
    private val imagesRemoteDataSource: PixabayImagesRemoteDataSource,
    private val imageMapper: ImageMapper
) : ImagesRepository {

    override suspend fun getImages(nextPage: Int): List<ImageModel> {
        return imagesRemoteDataSource.getImages(nextPage).map(imageMapper::map)
    }

    override suspend fun getImageById(imageId: Long): ImageModel {
        return imagesRemoteDataSource.getImageById(imageId).map(imageMapper::map).first()
    }
}
