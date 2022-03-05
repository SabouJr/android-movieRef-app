package fr.movieref.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.movieref.MainActivity
import fr.movieref.models.MovieModel
import fr.movieref.R
import fr.movieref.adapter.MovieAdapter
import fr.movieref.adapter.MovieitemDecoration

class CollectionFragment(
    private val context: MainActivity
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val popularMovieList = arrayListOf<MovieModel>()

        // ADD MOVIES //
        popularMovieList.add(
            MovieModel(
                "FOREST GUMP",
                "COMEDIE / DRAME / ROMANCE",
                "2h20m",
                "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.",
                "https://fr.web.img4.acsta.net/pictures/15/10/13/15/12/514297.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "LA LISTE DE SCHINDLER",
                "HISTOIRE / GUERRE",
                "3h15m",
                "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.",
                "https://fr.web.img6.acsta.net/pictures/19/03/14/10/37/5927961.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "POLICIER / FANTASTIQUE",
                "COMEDIE",
                "3h09m",
                "Paul Edgecomb, pensionnaire centenaire d'une maison de retraite, est hanté par ses souvenirs. Gardien-chef du pénitencier de Cold Mountain en 1935, il était chargé de veiller au bon déroulement des exécutions capitales en s’efforçant d'adoucir les derniers moments des condamnés. Parmi eux se trouvait un colosse du nom de John Coffey, accusé du viol et du meurtre de deux fillettes. Intrigué par cet homme candide et timide aux dons magiques, Edgecomb va tisser avec lui des liens très forts.",
                "https://images.affiches-et-posters.com//albums/3/2943/affiche-film-ligne-verte-475.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "12 HOMMES EN COLERE",
                "DRAME",
                "1h35m",
                "Lors d'un procès, un juré émet l'hypothèse que l'homme qu'il doit juger n'est peut-être pas coupable. Il va tenter de convaincre les onze autres jurés.",
                "https://fr.web.img3.acsta.net/medias/nmedia/18/35/24/09/18784292.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "LE PARRAIN",
                "POLICIER / DRAME",
                "2h55m",
                "En 1945, à New York, les Corleone sont une des cinq familles de la mafia. Don Vito Corleone, parrain de cette famille, marie sa fille à un bookmaker. Sollozzo,  parrain de la famille Tattaglia, propose à Don Vito une association dans le trafic de drogue, mais celui-ci refuse. Sonny, un de ses fils, y est quant à lui favorable. Afin de traiter avec Sonny, Sollozzo tente de faire tuer Don Vito, mais celui-ci en réchappe. Michael, le frère cadet de Sonny, recherche alors les commanditaires de l'attentat et tue Sollozzo et le chef de la police, en représailles. Michael part alors en Sicile, où il épouse Apollonia, mais celle-ci est assassinée à sa place. De retour à New York, Michael épouse Kay Adams et se prépare à devenir le successeur de son père...",
                "https://media1.woopic.com/api/v1/images/174%2Faudiovisual%2Fmovie%2F3c1%2F5c6%2F0e6c5d778c75c5eeaf43c0b00e%2Fmovies-1628-21885920.jpg?format=822x700&quality=85",
            )
        )

        popularMovieList.add(
            MovieModel(
                "LES EVADES",
                "DRAME",
                "2h22m",
                "En 1947, Andy Dufresne, un jeune banquier, est condamné à la prison à vie pour le meurtre de sa femme et de son amant. Ayant beau clamer son innocence, il est emprisonné à Shawshank, le pénitencier le plus sévère de l'Etat du Maine. Il y fait la rencontre de Red, un Noir désabusé, détenu depuis vingt ans. Commence alors une grande histoire d'amitié entre les deux hommes...",
                "https://fr.web.img3.acsta.net/medias/nmedia/18/63/30/68/18686447.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "LE SEIGNEUR DES ANNEAUX",
                "AVENTURE / FANTASTIQUE",
                "3h21m",
                "Les armées de Sauron ont attaqué Minas Tirith, la capitale de Gondor. Jamais ce royaume autrefois puissant n'a eu autant besoin de son roi. Mais Aragorn trouvera-t-il en lui la volonté d'accomplir sa destinée ? Tandis que Gandalf s'efforce de soutenir les forces brisées de Gondor, Théoden exhorte les guerriers de Rohan à se joindre au combat. Mais malgré leur courage et leur loyauté, les forces des Hommes ne sont pas de taille à lutter contre les innombrables légions d'ennemis qui s'abattent sur le royaume...",
                "https://fr.web.img3.acsta.net/medias/nmedia/18/35/14/33/18366630.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "LE ROI LION",
                "AVENTURE / ANIMATION",
                "1h29m",
                "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.",
                "https://fr.web.img3.acsta.net/pictures/19/02/25/12/06/2908996.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "VAL AU DESSUS D’UN NID DE COUCOU",
                "DRAME",
                "2h09m",
                "Rebellion dans un hôpital psychiatrique à l'instigation d'un malade qui se révolte contre la dureté d'une infirmière.",
                "https://fr.web.img4.acsta.net/medias/nmedia/00/02/55/99/affiche.jpg",
            )
        )

        popularMovieList.add(
            MovieModel(
                "THE DARK KNIGHT",
                "ACTION / THRILLER",
                "2h32m",
                "Batman entreprend de démanteler les dernières organisations criminelles de Gotham. Mais il se heurte bientôt à un nouveau génie du crime qui répand la terreur et le chaos dans la ville : le Joker...",
                "https://www.ecranlarge.com/uploads/image/001/125/8t7cemgym6dx0fa71yj6uo0rno-475.jpg",
            )
        )

        val view = inflater.inflate(R.layout.fragment_collection, container, false)

            // GET RECYCLER VIEW //
        val collectionRecyclerView = view.findViewById<RecyclerView>(R.id.collection_recycler_list)
        collectionRecyclerView.adapter = MovieAdapter(context, popularMovieList, R.layout.item_vertical_movie)
        collectionRecyclerView.layoutManager = LinearLayoutManager(context)
        collectionRecyclerView.addItemDecoration(MovieitemDecoration())

        return view
    }

}