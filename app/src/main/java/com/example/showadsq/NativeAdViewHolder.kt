package com.example.showadsq

import android.view.View
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.formats.UnifiedNativeAd
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdView


class NativeAdViewHolder(var view:View):RecyclerView.ViewHolder(view) {

    fun bindNativeAdViewHolder(pos:Int){
        AdLoader.Builder(view.context, "ca-app-pub-3940256099942544/2247696110")
            .forNativeAd {
                // Show the ad.
                populateNativeAdView(it)
            }
            .withAdListener(object : AdListener() {
                override fun onAdLoaded() {
                    super.onAdLoaded()
                }
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Toast.makeText(view.context, " faild to load add", Toast.LENGTH_SHORT).show()
                }
            })
            .build().loadAd(AdRequest.Builder().build())
    }

    private fun populateNativeAdView(
        nativeAd: NativeAd
    ) {
        // Some assets are guaranteed to be in every UnifiedNativeAd.
        view.findViewById<TextView>(R.id.ad_headline).text = nativeAd.headline
        view.findViewById<TextView>(R.id.ad_body).text = nativeAd.body
     view.findViewById<NativeAdView>(R.id.nativeView).setNativeAd(nativeAd)
   view.findViewById<ProgressBar>(R.id.pb).visibility = View.GONE
    }
}

