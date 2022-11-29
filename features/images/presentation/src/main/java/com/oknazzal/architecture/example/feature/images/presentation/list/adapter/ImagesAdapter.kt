package com.oknazzal.architecture.example.feature.images.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.oknazzal.architecture.example.feature.images.presentation.databinding.RowImageBinding
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel

class ImagesAdapter(private val onItemClick: (imageModel: ImageModel) -> Unit) :
    PagingDataAdapter<ImageModel, ImagesAdapter.ViewHolder>(DiffCallback) {

    private lateinit var layoutInflater: LayoutInflater

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        layoutInflater = LayoutInflater.from(recyclerView.context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RowImageBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position)!!)
    }

    inner class ViewHolder(private val binding: RowImageBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(selectorModel: ImageModel) {
            binding.image = selectorModel
            binding.executePendingBindings()

            itemView.setOnClickListener {
                val adapterPosition = bindingAdapterPosition
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    onItemClick(selectorModel)
                }
            }
        }
    }

    companion object {

        private object DiffCallback : DiffUtil.ItemCallback<ImageModel>() {

            override fun areItemsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean {
                return oldItem == newItem
            }
        }
    }
}
