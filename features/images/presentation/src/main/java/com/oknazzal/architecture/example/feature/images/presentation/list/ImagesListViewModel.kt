package com.oknazzal.architecture.example.feature.images.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.oknazzal.architecture.example.feature.images.data.remote.ImagesDataSource
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImagesListViewModel @Inject constructor(
    private val getListOfImagesUseCase: GetListOfImagesUseCase
) : ViewModel() {

    private val _imagesData = MutableLiveData<PagingData<ImageModel>?>(null)
    val imagesData: LiveData<PagingData<ImageModel>?> = _imagesData

    private val _progressData = MutableLiveData(false)
    val progressData: LiveData<Boolean> = _progressData

    init {
        getImages()
    }

    private fun getImages() {
        viewModelScope.launch {
            _progressData.postValue(true)
            val dataSource = ImagesDataSource(getListOfImagesUseCase)
            _imagesData.postValue(Pager(
                config = PagingConfig(
                    pageSize = 20,
                ),
                pagingSourceFactory = { dataSource }
            ).flow.cachedIn(viewModelScope).stateIn(viewModelScope).value)

            _progressData.postValue(false)
        }
    }
}