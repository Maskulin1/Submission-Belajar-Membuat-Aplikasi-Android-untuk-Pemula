package com.reihan.watchmovie.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reihan.watchmovie.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter(private val listMovie: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.layout_movie_main, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = listMovie[position]

        Glide.with(holder.itemView.context)
            .load(movie.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = movie.title
        holder.tvCast.text = movie.cast

        holder.tvName.setText(R.string.judul_movie)
        holder.tvName.append(": ${movie.title}")

        holder.tvCast.setText(R.string.pemeran_movie)
        holder.tvCast.append(": ${movie.cast}")

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, MovieDetailing::class.java)
            moveDetail.putExtra(MovieDetailing.EXTRA_NAME, "Judul : ${movie.title}")
            moveDetail.putExtra(MovieDetailing.EXTRA_PHOTO, movie.photo)
            moveDetail.putExtra(MovieDetailing.EXTRA_GENRE, "Genre : ${movie.genre}")
            moveDetail.putExtra(MovieDetailing.EXTRA_DURATION, "Durasi : ${movie.duration}")
            moveDetail.putExtra(MovieDetailing.EXTRA_YEAR, "Tahun : ${movie.year}")
            moveDetail.putExtra(MovieDetailing.EXTRA_PLATFORM, "Platform : ${movie.platform}")
            moveDetail.putExtra(MovieDetailing.EXTRA_RATING, "Rating : ${movie.rating}")
            moveDetail.putExtra(MovieDetailing.EXTRA_DIRECTOR, "Sutradara : ${movie.director}")
            moveDetail.putExtra(MovieDetailing.EXTRA_CAST, "Pemain : ${movie.cast}")
            moveDetail.putExtra(MovieDetailing.EXTRA_DESCRIPTION, "Deskripsi : ${movie.description}")
            mContext.startActivity(moveDetail)

        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvCast: TextView = itemView.findViewById(R.id.tv_item_cast)
    }
}