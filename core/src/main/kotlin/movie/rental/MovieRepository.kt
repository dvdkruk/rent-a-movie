package movie.rental

interface MovieRepository {
    fun getAll(): List<Movie>
    fun save(movie: Movie)
}
