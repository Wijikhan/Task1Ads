package com.example.showadsq

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val mLayoutManager =  GridLayoutManager(this, 2)
        recyclerView.layoutManager =mLayoutManager

        val adapter = RecyclerView_Adapter()
        recyclerView.adapter= adapter
        mLayoutManager.setSpanSizeLookup(object : SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    2,5,8 -> 2
                    else -> 1
                }
            }
        })
        adapter?.addList(MockList.getImageModel() as ArrayList<ImageModel>)
    }
}