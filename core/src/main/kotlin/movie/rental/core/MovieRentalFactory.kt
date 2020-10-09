package movie.rental.core

class MovieRentalFactory(private val movieRepository: MovieRepository) {
    fun createAvailableMoviesForRental() = AvailableMoviesRental(movieRepository)
}