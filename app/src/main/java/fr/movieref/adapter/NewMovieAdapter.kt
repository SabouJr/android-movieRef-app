package fr.movieref.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.movieref.R
import fr.movieref.models.Movie

class NewMovieAdapter (private val popularMovieList: List<Movie>) : RecyclerView.Adapter<NewMovieAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            val view  = LayoutInflater.from(parent.context).inflate(R.layout.fragment_collection,parent,false)
            return ViewHolder(view)
        }


        override fun getItemCount(): Int {

            return popularMovieList.size
        }


        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            Log.d("Response", "List Count :${popularMovieList.size} ")


            return holder.bind(popularMovieList[position])

        }
        class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {
            fun bind(movie: Movie) {

                // var imageView = itemView.findViewById<ImageView>(R.id.image_item)
                //var movieName = itemView.findViewById<TextView>(R.id.name_item)
                // var movieGenre = itemView.findViewById<TextView>(R.id.descriptionn_item)

            }
        }
    }