package com.oknazzal.architecture.example.feature.images.presentation.details

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
import com.oknazzal.architecture.example.feature.images.domain.usecase.GetImageByIdUseCase
import com.oknazzal.architecture.example.feature.images.domain.usecase.GetListOfImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImageDetailsViewModel @Inject constructor(
    private val getImageByIdUseCase: GetImageByIdUseCase
) : ViewModel() {

    private val _imagesData = MutableLiveData<ImageModel>(null)
    val imagesData: LiveData<ImageModel> = _imagesData

    private val _progressData = MutableLiveData(false)
    val progressData: LiveData<Boolean> = _progressData

    fun getImageById(imageId: Long) {
        viewModelScope.launch {
            _progressData.postValue(true)
            _imagesData.postValue(getImageByIdUseCase(imageId))
            _progressData.postValue(false)
        }
    }
}