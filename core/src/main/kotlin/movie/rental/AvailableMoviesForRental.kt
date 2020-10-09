package movie.rental

class AvailableMoviesRental(private val moviesRepository: MovieRepository) {
    fun execute(): List<Movie> = moviesRepository.getAll()
}
