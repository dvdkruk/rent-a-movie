package movie.rental.catalogue

interface MovieRepository {
    fun getAll(): List<Movie>
    fun save(movie: Movie)
}
