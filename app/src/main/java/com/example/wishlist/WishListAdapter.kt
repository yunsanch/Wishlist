package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishListAdapter(private val wishes: List<Wish>): RecyclerView.Adapter<WishListAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // TODO: Create member variables for any view that will be set
        // as you render a row.

        val itemEditText: EditText
        val priceEditText: EditText
        val storeEditText: EditText

        //        val senderTextView = TextView
//        val titleTextView = TextView
//        val summaryTextView = TextView
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            itemEditText = itemView.findViewById(R.id.itemWishedEt)
            priceEditText = itemView.findViewById(R.id.itemPriceEt)
            storeEditText = itemView.findViewById(R.id.nameStoreEt)
        }
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
        val email = emails.get(position)

        holder.itemEditText.text = email.sender
        holder.priceEditText.text = email.title
        holder.storeEditText.text = email.summary
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return emails.size
    }
}