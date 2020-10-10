package movie.rental

import movie.rental.catalogue.MovieRepository

internal class AvailableRentalMoviesImpl(private val moviesRepository: MovieRepository): AvailableRentalMovies {
    override fun execute() = moviesRepository.getAll()
}
