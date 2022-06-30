package com.example.myjson1

import MyDataItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id: TextView
        var name: TextView
        var phone:TextView



        init {
            id = itemView.findViewById(R.id.id)
            name= itemView.findViewById(R.id.name)
            phone=itemView.findViewById(R.id.ph)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text= userList[position].id.toString()
        holder.name.text=userList[position].name
        holder.phone.text=userList[position].phone
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}
