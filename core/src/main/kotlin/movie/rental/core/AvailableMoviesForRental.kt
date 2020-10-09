package movie.rental.core

class AvailableMoviesRental(private val moviesRepository: MovieRepository) {
    fun execute(): List<Movie> = moviesRepository.getAll()
}
