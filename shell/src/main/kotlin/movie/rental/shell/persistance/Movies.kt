package movie.rental.shell.persistance

import movie.rental.Movie
import movie.rental.MovieRepository
import org.springframework.stereotype.Repository

@Repository
class Movies: MovieRepository {
    override fun getAll(): List<Movie> {
        return listOf()
    }

    override fun save(movie: Movie) {
        TODO("Not yet implemented")
    }
}