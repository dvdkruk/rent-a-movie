package movie.rental.shell.persistance

import movie.rental.catalogue.Movie
import movie.rental.catalogue.MovieRepository
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