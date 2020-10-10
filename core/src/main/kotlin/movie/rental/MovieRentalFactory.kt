package movie.rental

import movie.rental.catalogue.MovieRepository

class MovieRentalFactory(private val movieRepository: MovieRepository) {
    fun createAvailableMoviesForRental(): AvailableRentalMovies = AvailableRentalMoviesImpl(movieRepository)
}