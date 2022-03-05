package fr.movieref.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.movieref.MainActivity
import fr.movieref.models.MovieModel
import fr.movieref.R
import fr.movieref.adapter.MovieAdapter
import fr.movieref.adapter.MovieitemDecoration


class HomeFragment(
    private val context: MainActivity
) : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // LIST TO STOCK MOVIES //
        val discoverMovieList = arrayListOf<MovieModel>()
        val lastMovieList = arrayListOf<MovieModel>()

        // ADD DISCOVER MOVIES //

        discoverMovieList.add(
            MovieModel(
                "LE PARRAIN 2EME PARTIE",
                "POLICIER / DRAME",
                "3h20m",
                "Depuis la mort de Don Vito Corleone, son fils Michael règne sur la famille. Amené à négocier avec la mafia juive, il perd le soutien de son lieutenant Frankie Pentageli. Echappant de justesse à un attentat, Michael tente de retrouver le coupable...",
                "https://fr.web.img6.acsta.net/medias/nmedia/18/35/24/16/18861226.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "THE BATMAN",
                "DRAME",
                "2h57m",
                "Lorsqu'un tueur s'en prend à l'élite de Gotham par une série de machinations sadiques, une piste d'indices cryptiques envoie Bruce Wayne alias Batman sur une enquête dans la pègre, où il rencontre des personnages tels que Selina Kyle, alias Catwoman, Oswald Cobblepot, alias le Pingouin, Carmine Falcone et Edward Nashton, alias l’Homme-Mystère.",
                "https://fr.web.img5.acsta.net/pictures/22/02/16/17/42/3125788.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "ILLUSIONS PERDU",
                "DRAME / HISTORIQUE",
                "2h30m",
                "Lucien est un jeune poète inconnu dans la France du XIXème siècle. Il a de grandes espérances et veut se forger un destin. Il quitte l’imprimerie familiale de sa province natale pour tenter sa chance à Paris, au bras de sa protectrice.",
                "https://fr.web.img6.acsta.net/pictures/21/08/19/11/37/0523511.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "PRESQUE",
                "COMEDIE",
                "1h32m",
                "Deux hommes prennent la route, de Lausanne vers le sud de la France, dans un corbillard. Ils se connaissent peu, ont peu de choses en commun, du moins le croient-ils…",
                "https://images.cinefil.com/movies/1104722.webp",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "TOUS EN SCENE 2",
                "ANIMATION / FAMILLE",
                "1h50m",
                "Buster Moon et sa troupe de bêtes de scène voient encore plus grand avec un spectacle complètement fou. Ils n’ont qu’un seul problème : persuader la star la plus anti sociale que le monde ait jamais connu de remonter sur scène avec eux.",
                "https://fr.web.img2.acsta.net/pictures/21/11/16/13/58/5571803.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "LE PARRAIN 3EME PARTIE",
                "POLICIER / DRAME",
                "2h40m",
                "Atteignant la soixantaine, Michael Corleone désire à la fois renouer avec les siens et se réhabiliter aux yeux de la société, surtout de l'Eglise. Il arrivera presque a ses fins, mais sa vie passée et ses anciens ennemis le rattraperont plus vite.",
                "https://fr.web.img3.acsta.net/medias/nmedia/18/35/24/17/18376629.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "LE CHENE",
                "AVENTURE / FAMILLE",
                "1h20m",
                "Il était une fois l’histoire d’un chêne, vieux de 210 ans, devenu un pilier en son royaume. Ce film d’aventure spectaculaire rassemble un casting hors du commun : écureuils, balanins, geais, fourmis, mulots….",  "https://fr.web.img3.acsta.net/pictures/21/12/22/15/08/4618712.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "MES FRERES ET MOI",
                "DRAME",
                "1h48m",
                "Nour a 14 ans. Il vit dans un quartier populaire au bord de la mer. Alors qu’il doit repeindre un couloir de son collège, il rencontre Sarah, une chanteuse lyrique qui anime un cours d’été.",  "https://fr.web.img6.acsta.net/pictures/21/11/09/17/47/4943820.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "LA VRAI FAMILLE",
                "DRAME",
                "1h42m",
                "Anna, 34 ans, vit avec son mari, ses deux petits garçons et Simon, un enfant placé chez eux par l’Assistance Sociale depuis l’âge de 18 mois, qui a désormais 6 ans. Un jour, le père biologique de Simon exprime le désir de récupérer la garde de son fils.",  "https://fr.web.img4.acsta.net/pictures/21/12/14/10/17/4915384.jpg",
            )
        )

        discoverMovieList.add(
            MovieModel(
                "ONODA : 10 000 NUITS DANS LA JUNGLE",
                "DRAME / HISTORIQUE / GUERRE",
                "2h47m",
                "Fin 1944. Le Japon est en train de perdre la guerre. Sur ordre du mystérieux Major Taniguchi, le jeune Hiroo Onoda est envoyé sur une île des Philippines juste avant le débarquement américain. Pour l'Empire, la guerre est sur le point de finir. Pour Onoda, elle s'achèvera 10 000 nuits plus tard.",  "https://fr.web.img2.acsta.net/pictures/21/06/14/13/36/1073488.jpg",
            )
        )

        // ADD LAST MOVIES //

        lastMovieList.add(
            MovieModel(
                "THE BATMAN",
                "DRAME",
                "2h57m",
                "Lorsqu'un tueur s'en prend à l'élite de Gotham par une série de machinations sadiques, une piste d'indices cryptiques envoie Bruce Wayne alias Batman sur une enquête dans la pègre, où il rencontre des personnages tels que Selina Kyle, alias Catwoman, Oswald Cobblepot, alias le Pingouin, Carmine Falcone et Edward Nashton, alias l’Homme-Mystère.",
                "https://fr.web.img5.acsta.net/pictures/22/02/16/17/42/3125788.jpg",
            )
        )
        lastMovieList.add(
            MovieModel(
                "BELFAST",
                "ACTION / POLICIER / DRAME",
                "1h39m",
                "Chronique de la vie d'un petit garçon irlandais et sa famille ouvrière au milieu des émeutes de la fin des années 60.",
                "https://fr.web.img6.acsta.net/pictures/22/01/10/15/33/4192632.jpg",
            )
        )
        lastMovieList.add(
            MovieModel(
                "RIEN A FOUTRE",
                "COMEDIE DRAMATIQUE",
                "1h55m",
                "Cassandre, 26 ans, est hôtesse de l’air dans une compagnie low-cost. Vivant au jour le jour, elle enchaîne les vols et les fêtes sans lendemain, fidèle à son pseudo Tinder «Carpe Diem». Alors que la pression de sa compagnie redouble, Cassandre finit par perdre pied.\n",
                "https://fr.web.img2.acsta.net/c_310_420/pictures/22/02/11/15/59/0440387.jpg",
            )
        )
        lastMovieList.add(
            MovieModel(
                "VIENS JE T'EMMENE",
                "COMEDIE",
                "1h40m",
                "A Clermont-Ferrand, Médéric tombe amoureux d’Isadora, une prostituée de 50 ans, mais elle est mariée. Alors que le centre-ville est le théâtre d’une attaque terroriste, Selim, un jeune sans-abri se réfugie dans l’immeuble de Médéric provoquant une paranoïa collective.",
                "https://fr.web.img4.acsta.net/pictures/22/01/18/16/03/0079581.jpg",
            )
        )
        lastMovieList.add(
            MovieModel(
                "ROBUSTE",
                "COMEDIE DRAMATIQUE",
                "1h35m",
                "Lorsque son bras droit et seul compagnon doit s’absenter pendant plusieurs semaines, Georges, star de cinéma vieillissante, se voit attribuer une remplaçante, Aïssa. Entre l’acteur désabusé et la jeune agente de sécurité, un lien unique va se nouer.",
                "https://www.lequotidienducinema.com/wp-content/uploads/2022/03/5525534.jpg-r_1920_1080-f_jpg-q_x-xxyxx.jpg",
            )
        )

        lastMovieList.add(
            MovieModel(
                "ALI & AVA",
                "COMEDIE DRAMATIQUE / ROMANCE",
                "1h35m",
                "Ali et Ava n’avaient aucune raison de se rencontrer. Blessés par la vie, c’est leur affection commune pour Sofia, une jeune fille dont Ava est l’assistante scolaire qui les fait se croiser. De là va naître un lien profond au-delà des différences sociales et culturelles.",
                "https://www.grignoux.be/upload/grignoux/films/1486/ali_et_ava_affiche.jpg",
        )
        )

        lastMovieList.add(
            MovieModel(
                "LA-HAUT PERCHES",
                "DOCUMENTAIRE",
                "1h47m",
                "Perchés dans un hameau des Alpes-de-Haute-Provence, Mich, Coco, Christiane, François et les autres résistent comme ils peuvent au temps qui passe, à la solitude et aux infortunes de la vie. Quand une vieille histoire de météorite refait surface.",
                "https://media.senscritique.com/media/000020435526/source_big/la_haut_perches.jpg",
        )
        )

        lastMovieList.add(
            MovieModel(
                "KOMBINAT",
                "DOCUMENTAIRE",
                "1h15m",
                "Lena, Sasha et son frère Guenia vivent à Magnitogorsk, une ville industrielle au coeur de la Russie qui dépend de son gigantesque Kombinat.",
                "https://media.senscritique.com/media/000020562922/source_big/kombinat.jpg",
        )
        )

        lastMovieList.add(
            MovieModel(
                "HEY SINAMIKA",
                "COMEDIE / ROMANCE",
                "2h30m",
                "Mouna, tombe sous le charme de Yaazhan, un homme excentrique et attachant. Ils vivent leur idylle mais au bout de 2 ans, les choses prennent une tournure inattendue, avec l'arrivée de la troublante Malarvizhi...",
                "https://fr.web.img2.acsta.net/c_310_420/pictures/22/02/23/16/52/0055142.jpg",
            )
        )

        lastMovieList.add(
            MovieModel(
                "DOWN IN PARIS",
                "DRAME / ROMANCE",
                "1h40m",
                "Richard, cinéaste d’une quarantaine d’années gagné par une crise d’angoisse inexpliquée, lâche son tournage en cours et se livre à une déambulation dans un Paris nocturne.",
                "https://fr.web.img3.acsta.net/pictures/21/02/08/10/51/3758796.jpg",
            )
        )




        // GET RECYCLER VIEW //
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = MovieAdapter(context, discoverMovieList.filter {!it.liked}, R.layout.item_horizontal_movie)

        // GET SECOND RECYCLER VIEW //
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = MovieAdapter(context, lastMovieList, R.layout.item_vertical_movie)
        verticalRecyclerView.addItemDecoration(MovieitemDecoration())


        return view
    }


}