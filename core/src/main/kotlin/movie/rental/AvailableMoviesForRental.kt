package movie.rental

import movie.rental.catalogue.Movie

interface AvailableRentalMovies {
    fun execute(): List<Movie>
}
