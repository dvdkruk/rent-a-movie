package movie.rental.shell.web

import movie.rental.AvailableMoviesRental
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class MovieRentalController(private val availableMoviesRental: AvailableMoviesRental) {

    @GetMapping
    fun getAvailableMovies() = availableMoviesRental.execute()
}