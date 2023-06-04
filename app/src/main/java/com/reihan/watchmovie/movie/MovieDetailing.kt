package com.reihan.watchmovie.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.reihan.watchmovie.R

class MovieDetailing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detailing)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Movies"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val shareButton = findViewById<Button>(R.id.action_share)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            val shareBody = "${intent.getStringExtra(EXTRA_NAME)}\n" +
                    "${intent.getStringExtra(EXTRA_GENRE)}\n" +
                    "${intent.getStringExtra(EXTRA_DURATION)}\n" +
                    "${intent.getStringExtra(EXTRA_YEAR)}\n" +
                    "${intent.getStringExtra(EXTRA_PLATFORM)}\n" +
                    "${intent.getStringExtra(EXTRA_RATING)}\n" +
                    "${intent.getStringExtra(EXTRA_DIRECTOR)}\n" +
                    "${intent.getStringExtra(EXTRA_CAST)}\n" +
                    "${intent.getStringExtra(EXTRA_DESCRIPTION)}"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Share this Great Movie")
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

        val watchButton = findViewById<Button>(R.id.btn_watch)
        watchButton.setOnClickListener {
            Toast.makeText(this, "Selamat Menonton", Toast.LENGTH_SHORT).show()
        }

        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetGenre: TextView = findViewById(R.id.tv_item_genre)
        val tvSetDuration: TextView = findViewById(R.id.tv_item_duration)
        val tvSetYear: TextView = findViewById(R.id.tv_item_year)
        val tvSetPlatform: TextView = findViewById(R.id.tv_item_platform)
        val tvSetRating: TextView = findViewById(R.id.tv_item_rating)
        val tvSetDirector: TextView = findViewById(R.id.tv_item_director)
        val tvSetCast: TextView = findViewById(R.id.tv_item_cast)
        val tvSetDescription: TextView = findViewById(R.id.tv_item_description)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tGenre = intent.getStringExtra(EXTRA_GENRE)
        val tDuration = intent.getStringExtra(EXTRA_DURATION)
        val tYear = intent.getStringExtra(EXTRA_YEAR)
        val tPlatform = intent.getStringExtra(EXTRA_PLATFORM)
        val tRating = intent.getStringExtra(EXTRA_RATING)
        val tDirector = intent.getStringExtra(EXTRA_DIRECTOR)
        val tCast = intent.getStringExtra(EXTRA_CAST)
        val tDescription = intent.getStringExtra(EXTRA_DESCRIPTION)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetGenre.text = tGenre
        tvSetDuration.text = tDuration
        tvSetYear.text = tYear
        tvSetPlatform.text = tPlatform
        tvSetRating.text = tRating
        tvSetDirector.text = tDirector
        tvSetCast.text = tCast
        tvSetDescription.text = tDescription
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_DURATION = "extra_duration"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_PLATFORM = "extra_platform"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_DIRECTOR = "extra_director"
        const val EXTRA_CAST = "extra_cast"
        const val EXTRA_DESCRIPTION = "extra_description"
    }

    @Suppress("DEPRECATION")
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}