package com.oknazzal.architecture.example.feature.images.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase

class ImagesDataSource(
    private val getListOfImagesUseCase: GetListOfImagesUseCase
) : PagingSource<Int, ImageModel>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageModel> {
        return try {
            var nextPage = params.key ?: 1
            val imagesListResponse = getListOfImagesUseCase(nextPage)

            LoadResult.Page(
                data = imagesListResponse,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (imagesListResponse.isNotEmpty()) ++nextPage else null
            )
        } catch (throwable: Throwable) {
            LoadResult.Error(throwable)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ImageModel>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val (_, prevKey, nextKey) = state.closestPageToPosition(anchorPosition)
            ?: return null
        if (prevKey != null) {
            return prevKey + 1
        }
        return if (nextKey != null) {
            nextKey - 1
        } else null
    }
}
