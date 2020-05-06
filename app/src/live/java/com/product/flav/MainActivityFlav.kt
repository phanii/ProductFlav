package com.product.flav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.live.live_main.*

class MainActivityFlav : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.live_main)
        live_btn.setOnClickListener {
            live_text.text = BuildConfig.FLAVOR +" ->" +  BuildConfig.BUILD_TYPE
            startActivity(Intent(this,LiveActiivy::class.java))
        }
    }
}
