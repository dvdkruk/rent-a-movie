package movie.rental.shell.web

import movie.rental.AvailableRentalMovies
import movie.rental.catalogue.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class MovieRentalController(private val availableRentalMovies: AvailableRentalMovies) {

    @GetMapping("/movies")
    fun availableMovies(): AvailableMoviesResponse {
        val movies = availableRentalMovies.get()
        return AvailableMoviesResponse(movies)
    }

    data class AvailableMoviesResponse(val movies: List<Movie>)
}
