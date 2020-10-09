package movie.rental

class MovieRentalFactory(private val movieRepository: MovieRepository) {
    fun createAvailableMoviesForRental() = AvailableMoviesRental(movieRepository)
}