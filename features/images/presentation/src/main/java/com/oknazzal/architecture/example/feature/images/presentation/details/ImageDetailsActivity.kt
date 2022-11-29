package com.oknazzal.architecture.example.feature.images.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel
import com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImageDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ImageDetailsActivity : AppCompatActivity() {

    private val binding by lazy { ActivityImageDetailsBinding.inflate(layoutInflater) }
    private val viewModel: ImageDetailsViewModel by viewModels()
    private var imageId: Long? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        imageId = intent.getLongExtra(EXTRA_IMAGE_ID,0)
        initObservers()

        viewModel.getImageById(imageId!!)
    }

    private fun initObservers() {
        viewModel.progressData.observe(this, ::handleProgress)
        viewModel.imagesData.observe(this, ::handleContent)
    }

    private fun handleContent(image:ImageModel?) {
        if (image != null) {
            binding.image=image
        }
    }

    private fun handleProgress(show: Boolean) {
        binding.progressBar.isVisible = show
    }

    companion object {
         private const val EXTRA_IMAGE_ID = "EXTRA_IMAGE_ID"

        fun start(
            context: Context,
            imageId: Long?
        ) {
            val intent = Intent(context, ImageDetailsActivity::class.java)
            intent.putExtra(EXTRA_IMAGE_ID, imageId)
            context.startActivity(intent)
        }
    }
}
