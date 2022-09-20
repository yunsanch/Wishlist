package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListAdapter(private val wisher: List<Wish>): RecyclerView.Adapter<WishListAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // TODO: Create member variables for any view that will be set
        // as you render a row.

        val priceTextView = itemView.findViewById<TextView>(R.id.priceTv)
        val storeTextView = itemView.findViewById<TextView>(R.id.urlItemtv)
        val itemTextView = itemView.findViewById<TextView>(R.id.itemNameTv)

        //        val senderTextView = TextView
//        val titleTextView = TextView
//        val summaryTextView = TextView
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        TODO("Not yet implemented")
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.wish_item, parent,false)

        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val wishing = wisher.get(position)

        holder.itemTextView.text = wishing.wish
        holder.priceTextView.text = wishing.price
        holder.storeTextView.text = wishing.store
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return wisher.size
    }
}