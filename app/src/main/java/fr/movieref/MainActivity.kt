package fr.movieref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.movieref.fragments.CollectionFragment
import fr.movieref.fragments.ConnexionFragment
import fr.movieref.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment(this), R.string.home_page_title)

        // IMPORT NAV VIEW //
        val navigationView = findViewById<BottomNavigationView>(R.id.navigation_view)
        navigationView.setOnNavigationItemSelectedListener {
             when (it.itemId) {
                R.id.home_page -> {
                    loadFragment(HomeFragment(this), R.string.home_page_title)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.collection_page -> {
                    loadFragment(CollectionFragment(this), R.string.collection_page_title)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.connexion_page -> {
                    loadFragment(ConnexionFragment(this), R.string.connexion_page_title)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }
        }

    private fun loadFragment(fragment: Fragment, string: Int) {
        // ACTUALISE PAGE TITLE //
        findViewById<TextView>(R.id.page_title).text = resources.getString(string)



        // INJECT FRAGMENT IN FRAGMENT CONTAINER //
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}