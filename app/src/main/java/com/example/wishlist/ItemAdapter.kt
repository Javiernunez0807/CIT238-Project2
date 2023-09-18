package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ItemAdapter(private val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>()
{

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemV: TextView
        val priceV: TextView
        val urlV: TextView

        init {
            itemV = itemView.findViewById(R.id.iNameET)
            priceV = itemView.findViewById(R.id.iPriceET)
            urlV = itemView.findViewById(R.id.iUrlET)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.wishitem, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items.get(position)

        holder.itemV.text = item.name
        holder.priceV.text = item.price
        holder.urlV.text = item.url

    }

    override fun getItemCount(): Int {

        return items.size
    }


}