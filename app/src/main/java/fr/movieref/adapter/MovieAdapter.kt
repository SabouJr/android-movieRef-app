package fr.movieref.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fr.movieref.MainActivity
import fr.movieref.models.MovieModel
import fr.movieref.MoviePopup
import fr.movieref.R

class MovieAdapter(
    val context: MainActivity,
    private val movieList: List<MovieModel>,
    private val LayoutId: Int
) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // Movie Image //
        val movieImage = view.findViewById<ImageView>(R.id.image_item)
        val movieName:TextView? = view.findViewById(R.id.name_item)
        val movieDecritpion:TextView? = view.findViewById(R.id.descriptionn_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(LayoutId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // GET MOVIE INFOS //
        val currentMovie = movieList[position]

        // USE GLIDE TO GET IMAGE BY URL //
        Glide.with(context).load(Uri.parse(currentMovie.imageUrl)).into(holder.movieImage)

        // UPDATE MOVIE NAME //
        holder.movieName?.text = currentMovie.name

        // UPDATE MOVIE DESCRIPTION //
        holder.movieDecritpion?.text = currentMovie.description

        // INTERACTION AT CLICK //
        holder.itemView.setOnClickListener{
            // SHOW POPUP //
            MoviePopup(this, currentMovie).show()
        }
    }

    override fun getItemCount(): Int = movieList.size
}


