package com.oknazzal.architecture.example.core.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.view.isVisible
import com.oknazzal.architecture.example.core.components.databinding.ViewErrorBinding

class ErrorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    val binding = ViewErrorBinding.inflate(LayoutInflater.from(context), this, true)

    private var onRetryClickListener: (() -> Unit)? = null

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        isVisible = false
        binding.buttonRetry.setOnClickListener {
            isVisible = false
            this.onRetryClickListener?.invoke()
        }
    }

    fun setError(throwable: Throwable) {
        isVisible = true
        binding.textViewError.text = throwable.message
    }

    fun setRetryClickListener(onRetryClickListener: () -> Unit) {
        this.onRetryClickListener = onRetryClickListener
    }
}
