package com.example.a_la_vez.dms.recyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a_la_vez.R

class adapter(val context: Context, val devList: ArrayList<Developer>) :
    RecyclerView.Adapter<adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.introdevelop_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(devList[position], context)
    }

    override fun getItemCount(): Int {
        return devList.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Photo = itemView?.findViewById<ImageView>(R.id.develop_img)
        val Name = itemView?.findViewById<TextView>(R.id.develop_name_tv)
        val Part = itemView?.findViewById<TextView>(R.id.develop_part_tv)


        fun bind(developer: Developer, context: Context) {
            /* 이미지가 없는 경우 안드로이드 기본 아이콘을 표시한다.*/
            if (developer.photo != "") {
                val resourceId = context.resources.getIdentifier(
                    developer.photo,
                    "drawable",
                    context.packageName
                )
                Photo?.setImageResource(resourceId)
            } else {
                Photo?.setImageResource(R.mipmap.ic_launcher)
            }
            Name?.text = developer.name
            Part?.text = developer.part
        }
    }
}
