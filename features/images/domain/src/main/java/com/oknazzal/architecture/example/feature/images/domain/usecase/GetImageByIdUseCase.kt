package com.oknazzal.architecture.example.feature.images.domain.usecase

import com.oknazzal.architecture.example.feature.images.domain.ImagesRepository
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import javax.inject.Inject

class GetImageByIdUseCase @Inject constructor(
    private val repository: ImagesRepository
) {

    suspend operator fun invoke(imageId: Long): ImageModel {
        return repository.getImageById(imageId)
    }
}
