package com.reihan.watchmovie.about

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.reihan.watchmovie.R
import com.bumptech.glide.Glide

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_layout)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myImage: ImageView = findViewById(R.id.img_item_photo)
        Glide.with(this)
            .load(ContextCompat.getDrawable(this, R.drawable.profil))
            .into(myImage)
    }

    @Suppress("DEPRECATION")
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}