package movie.rental

internal class AvailableRentalMoviesImpl(private val moviesRepository: MovieRepository): AvailableRentalMovies {
    override fun execute() = moviesRepository.getAll()
}
