package com.example.showadsq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.nativead.NativeAd
import java.lang.annotation.Native

class RecyclerView_Adapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
     var   list =  ArrayList<BaseItem>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
      if (viewType==0){
          val v = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
          return ImageViewHolder(v)
      }else{
          val v = LayoutInflater.from(parent.context).inflate(R.layout.item_native_ad, parent, false)
          return NativeAdViewHolder(v)
      }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        list[position].Bind(holder,position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int = list[position].itemType()

    fun addList(countryList: MutableList<ImageModel>?) {
        list.clear()
        countryList?.forEachIndexed { index, x ->
            try {
                //set ads position
                if (index==2||index==4||index==6)
                    list.add(Native())
                list.add(MyImage(x))
            } catch (ex: Exception) {
            }
        }
        notifyDataSetChanged()
    }

    private class MyImage(var imageModel: ImageModel):BaseItem(){
        override fun itemType(): Int {
            return 0
        }

        override fun Bind(recylerViewHolder: RecyclerView.ViewHolder, position: Int) {
            if (recylerViewHolder is ImageViewHolder) {
                recylerViewHolder.bindImageViewHolder(imageModel,position)
            }
        }
    }

    private class Native():BaseItem(){

        override fun itemType(): Int {
            return 1
        }

        override fun Bind(recylerViewHolder: RecyclerView.ViewHolder, position: Int) {
            if (recylerViewHolder is NativeAdViewHolder) {
                recylerViewHolder.bindNativeAdViewHolder(position)
            }
        }
    }


}


