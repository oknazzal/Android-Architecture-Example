package com.oknazzal.architecture.example.feature.images.presentation.list

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.PagingData
import com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImagesListBinding
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import com.oknazzal.architecture.example.feature.images.presentation.details.ImageDetailsActivity
import com.oknazzal.architecture.example.feature.images.presentation.list.adapter.ImagesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ImagesListActivity : AppCompatActivity() {

    private val binding by lazy { ActivityImagesListBinding.inflate(layoutInflater) }
    private val viewModel: ImagesListViewModel by viewModels()
    private var adapter = ImagesAdapter { handleItemClick(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initAdapter()
        initListeners()
        initObservers()
    }

    private fun initListeners() {
        adapter.addLoadStateListener { loadState ->
            binding.progressBar.isVisible = when (loadState.source.refresh) {
                is LoadState.Loading -> true
                else -> false
            }
        }
    }

    private fun initAdapter() {
        binding.recyclerViewImages.adapter = adapter
    }

    private fun initObservers() {
        viewModel.progressData.observe(this, ::handleProgress)
        viewModel.imagesData.observe(this, ::handleContent)
    }

    private fun handleContent(images: PagingData<ImageModel>?) {
        if (images != null) {
            adapter.submitData(lifecycle, images)
        }
    }

    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }

    private fun handleItemClick(imageModel: ImageModel) {

        ImageDetailsActivity.start(this,imageModel.id)
    }
}
