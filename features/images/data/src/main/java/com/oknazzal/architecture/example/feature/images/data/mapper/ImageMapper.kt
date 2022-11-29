package com.oknazzal.architecture.example.feature.images.data.mapper

import com.oknazzal.architecture.example.feature.images.data.remote.model.RemotePixabayImage
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import javax.inject.Inject

internal class ImageMapper @Inject constructor() {

    fun map(source: RemotePixabayImage): ImageModel {
        return ImageModel(
            source.id,
            source.type,
            source.tags,
            source.previewURL,
            source.largeImageURL,
            source.imageSize,
            source.views,
            source.likes,
            source.comments,
            source.downloads,
            source.user,
            source.userImageURL
        )
    }
}
