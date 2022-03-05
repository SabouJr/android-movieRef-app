package fr.movieref

import android.app.Dialog
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import fr.movieref.adapter.MovieAdapter
import fr.movieref.models.MovieModel

class MoviePopup (
    private val adapter: MovieAdapter,
    private val currentMovie: MovieModel
) : Dialog(adapter.context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.popup_movies_details)
        setupComponents()
        setupCloseButton()
    }

    private fun setupCloseButton() {
        findViewById<ImageView>(R.id.close_button).setOnClickListener{
            dismiss()
        }
    }

    private fun setupComponents() {
        // ACTUALISE POPUP MOVIE IMAGE //
        val movieImage = findViewById<ImageView>(R.id.image_item)
        Glide.with(adapter.context).load(Uri.parse(currentMovie.imageUrl)).into(movieImage)

        // ACTUALISE POPUP MOVIE NAME //
        findViewById<TextView>(R.id.popup_movie_name).text = currentMovie.name

        // ACTUALISE POPUP MOVIE DESCRIPTION //
        findViewById<TextView>(R.id.popup_movie_description_subtitle).text = currentMovie.description

        // ACTUALISE POPUP MOVIE TIME //
        findViewById<TextView>(R.id.popup_movie_subtitle_time).text = currentMovie.time

        // ACTUALISE POPUP MOVIE SYNOPSIS //
        findViewById<TextView>(R.id.popup_movie_synopsis_subtitle).text = currentMovie.synopsis
    }

}