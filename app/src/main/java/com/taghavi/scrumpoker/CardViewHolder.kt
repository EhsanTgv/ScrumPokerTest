package com.taghavi.scrumpoker

import androidx.recyclerview.widget.RecyclerView
import com.taghavi.scrumpoker.databinding.ItemCardBinding

class CardViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: Card, clickListener: CardAdapter.CardClickListener) {
        binding.card = card
        binding.listener = clickListener
        binding.executePendingBindings()
    }
}