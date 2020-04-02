package com.example.arcscreen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var imageListAdapter: ImageListAdapter
    var imagelist=ArrayList<listImagesScreenModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagelist= arrayListOf()
        var list=ArrayList<String>()
        list= arrayListOf("a","b","c","a","a","a","a","a","a","a","a","f","a","a","a","a","a")
        val parts=chopped(list,12)
        if (parts != null) {
            (0..parts.size-1).forEach {
                var model=listImagesScreenModel(parts[it] as ArrayList<String>)
                imagelist.add(model)
            }
            imageListAdapter= ImageListAdapter(imagelist,this)
            rcv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
            rcv.adapter=imageListAdapter
            Log.i("model", imagelist.toString())
        }
        Log.i("lists",parts.toString())
    }
    fun <T> chopped(
        list: ArrayList<T>,
        L: Int
    ): List<List<T>>? {
        val parts: MutableList<List<T>> =
            ArrayList()
        val N = list.size
        var i = 0
        while (i < N) {
            parts.add(
                ArrayList(
                    list.subList(i, Math.min(N, i + L))
                )
            )
            i += L
        }
        return parts
    }

}
