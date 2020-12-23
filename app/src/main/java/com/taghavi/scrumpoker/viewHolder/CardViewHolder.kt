package com.taghavi.scrumpoker.viewHolder

import androidx.recyclerview.widget.RecyclerView

class CardViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: Card, clickListener: CardClickListener) {
        binding.card = card
        binding.listener = clickListener
        binding.executePendingBindings()
    }
}