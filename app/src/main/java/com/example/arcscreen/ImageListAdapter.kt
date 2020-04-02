package com.example.arcscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ImageListAdapter(private var list: List<listImagesScreenModel>,private var context: Context):RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    class ViewHolder internal constructor(view: View):RecyclerView.ViewHolder(view){
        var imageView1=view.findViewById<View>(R.id.imageView1)
        var imageView2=view.findViewById<View>(R.id.imageView2)
        var imageView3=view.findViewById<View>(R.id.imageView3)
        var imageView4=view.findViewById<View>(R.id.imageView4)
        var imageView5=view.findViewById<View>(R.id.imageView5)
        var imageView6=view.findViewById<View>(R.id.imageView6)
        var imageView7=view.findViewById<View>(R.id.imageView7)
        var imageView8=view.findViewById<View>(R.id.imageView8)
        var imageView9=view.findViewById<View>(R.id.imageView9)
        var imageView10=view.findViewById<View>(R.id.imageView10)
        var imageView11=view.findViewById<View>(R.id.imageView11)
        var imageView12=view.findViewById<View>(R.id.imageView12)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageListAdapter.ViewHolder {
        val vh: RecyclerView.ViewHolder
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_images, parent, false)
        vh = ViewHolder(v)
        return vh
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ImageListAdapter.ViewHolder, position: Int) {
        holder.imageView1.visibility = View.GONE
        holder.imageView2.visibility = View.GONE
        holder.imageView3.visibility = View.GONE
        holder.imageView4.visibility = View.GONE
        holder.imageView5.visibility = View.GONE
        holder.imageView6.visibility = View.GONE
        holder.imageView7.visibility = View.GONE
        holder.imageView8.visibility = View.GONE
        holder.imageView9.visibility = View.GONE
        holder.imageView10.visibility = View.GONE
        holder.imageView11.visibility = View.GONE
        holder.imageView12.visibility = View.GONE
        (0..list[position].list.size-1).forEach {
            var name="holder.imageView"+it
            when(it)
            {
                0 ->
                {
                    holder.imageView1.setBackgroundResource(R.drawable.download)
                    holder.imageView1.setVisibility(View.VISIBLE)
                }
                1 ->
                {
                    holder.imageView2.setBackgroundResource(R.drawable.download)
                    holder.imageView2.setVisibility(View.VISIBLE)
                }
                2 ->
                {
                    holder.imageView3.setBackgroundResource(R.drawable.download)
                    holder.imageView3.setVisibility(View.VISIBLE)
                }
                3 ->
                {
                    holder.imageView4.setBackgroundResource(R.drawable.download)
                    holder.imageView4.setVisibility(View.VISIBLE)
                }
                4 ->
                {
                    holder.imageView5.setBackgroundResource(R.drawable.download)
                    holder.imageView5.setVisibility(View.VISIBLE)
                }
                5 ->
                {
                    holder.imageView6.setBackgroundResource(R.drawable.download)
                    holder.imageView6.setVisibility(View.VISIBLE)
                }
                6 ->
                {
                    holder.imageView7.setBackgroundResource(R.drawable.download)
                    holder.imageView7.setVisibility(View.VISIBLE)
                }
                7 ->
                {
                    holder.imageView8.setBackgroundResource(R.drawable.download)
                    holder.imageView8.setVisibility(View.VISIBLE)
                }
                8 ->
                {
                    holder.imageView9.setBackgroundResource(R.drawable.download)
                    holder.imageView9.setVisibility(View.VISIBLE)
                }
                9 ->
                {
                    holder.imageView10.setBackgroundResource(R.drawable.download)
                    holder.imageView10.setVisibility(View.VISIBLE)
                }
                10 ->
                {
                    holder.imageView11.setBackgroundResource(R.drawable.download)
                    holder.imageView11.setVisibility(View.VISIBLE)
                }
                11 ->
                {
                    holder.imageView12.setBackgroundResource(R.drawable.download)
                    holder.imageView12.setVisibility(View.VISIBLE)
                }
             }
        }
    }
}