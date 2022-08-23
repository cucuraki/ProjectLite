package com.example.projectlite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.projectlite.databinding.InnerRecyclerItemBinding

class InnerAdapter :
    ListAdapter<OuterModel.InnerModel, InnerAdapter.InnerViewHolder>(InnerDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = InnerViewHolder(
        InnerRecyclerItemBinding.inflate(LayoutInflater.from(parent.context))
    )

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class InnerViewHolder(private val binding: InnerRecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val model = getItem(position)
            with(binding) {
                icon.setImageResource(model.drawable)
                tittle.text = model.title
                amount.text = if(model.amount>0) "$${model.amount}" else "-$${-model.amount}"
            }
        }
    }
}

class InnerDiffUtil : DiffUtil.ItemCallback<OuterModel.InnerModel>() {
    override fun areItemsTheSame(
        oldItem: OuterModel.InnerModel,
        newItem: OuterModel.InnerModel
    ) = oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: OuterModel.InnerModel,
        newItem: OuterModel.InnerModel
    ) = oldItem == newItem

}