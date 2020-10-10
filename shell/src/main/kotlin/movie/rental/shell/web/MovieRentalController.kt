package movie.rental.shell.web

import movie.rental.AvailableRentalMovies
import movie.rental.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class MovieRentalController(private val availableRentalMovies: AvailableRentalMovies) {

    @GetMapping("/movies")
    fun availableMovies(): AvailableMoviesResponse {
        val movies = availableRentalMovies.execute()
        return AvailableMoviesResponse(movies)
    }

    data class AvailableMoviesResponse(val movies: List<Movie>)
}
