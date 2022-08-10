package com.example.foodapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.foodapp.R
import com.example.foodapp.models.MyFood
import kotlinx.android.synthetic.main.activity_iteam_list.view.*


class MyFoodAdapter(val list: ArrayList<MyFood>, context: Context) :
    ArrayAdapter<MyFood>(context, R.layout.activity_iteam_list, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView: View
        if (convertView == null) {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_iteam_list, parent, false)
        } else {
            itemView = convertView
        }

        itemView.tv_item.text = getItem(position)?.name
        return itemView
    }
}
