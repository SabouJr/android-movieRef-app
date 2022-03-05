package fr.movieref.services

import fr.movieref.models.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("movies/popular")
    fun getAffectedMovieList () : Call<List<Movie>>
}
