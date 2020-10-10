package movie.rental

import movie.rental.catalogue.Movie
import movie.rental.catalogue.MovieRepository

interface AvailableRentalMovies {
    fun get(): List<Movie>
}

fun createAvailableRentalMovies(moviesRepository: MovieRepository): AvailableRentalMovies {
    return AvailableRentalMoviesImpl(moviesRepository)
}

private class AvailableRentalMoviesImpl(private val moviesRepository: MovieRepository): AvailableRentalMovies {
    override fun get() = moviesRepository.getAll()
}
