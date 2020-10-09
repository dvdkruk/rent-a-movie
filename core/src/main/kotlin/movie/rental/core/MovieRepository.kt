package movie.rental.core

interface MovieRepository {
    fun getAll(): List<Movie>
    fun save(movie: Movie)
}