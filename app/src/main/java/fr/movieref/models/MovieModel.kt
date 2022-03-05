package fr.movieref.models

class MovieModel(
    val name: String = "Titanic",
    val description: String = "Petite description",
    val time: String = "1h45",
    val synopsis: String = "LOREM IPSUM",
    val imageUrl: String = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.fr%2FTitanic-Affiche-Originale-40x53-Roul%25C3%25A9e%2Fdp%2FB07KQ6284F&psig=AOvVaw2V_h9sR0rnzBGHVSzC24gj&ust=1645526835936000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOjs0qbPkPYCFQAAAAAdAAAAABAD",
    var liked: Boolean = false
)