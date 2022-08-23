package com.example.projectlite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import com.example.projectlite.databinding.OuterRecyclerItemBinding

class OuterAdapter : ListAdapter<OuterModel, OuterAdapter.OuterViewHolder>(OuterDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = OuterViewHolder(OuterRecyclerItemBinding.inflate(LayoutInflater.from(parent.context)))


    override fun onBindViewHolder(holder: OuterViewHolder, position: Int) {
        holder.bind(position)
    }


    inner class OuterViewHolder(private val binding: OuterRecyclerItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            val model = getItem(position)
            with(binding){
                date.text = model.time
                val manager = LinearLayoutManager(binding.root.context)
                val adapter = InnerAdapter()
                adapter.submitList(model.transactions)
                innerRecycler.layoutManager = manager
                innerRecycler.adapter = adapter
                innerRecycler.addItemDecoration(DividerItemDecoration(innerRecycler.context, manager.orientation).apply { setDrawable(binding.root.context.getDrawable(R.drawable.line)!!) })
            }
        }
    }
}


class OuterDiffUtil(): DiffUtil.ItemCallback<OuterModel>(){
    override fun areItemsTheSame(oldItem: OuterModel, newItem: OuterModel) = oldItem.time == newItem.time
    override fun areContentsTheSame(oldItem: OuterModel, newItem: OuterModel) = oldItem == newItem

}