package fr.movieref.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.movieref.MainActivity
import fr.movieref.R
import fr.movieref.adapter.MovieAdapter
import fr.movieref.adapter.MovieitemDecoration

class ConnexionFragment(
    private val context: MainActivity
) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(R.layout.fragment_connexion, container, false)

        return view
    }
}