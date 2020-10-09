package movie.rental.core

import kotlin.test.*
import kotlin.test.Test

internal class AvailableMoviesRentalTest {
    private val movieRepository: MovieRepository = FakeMovieRepository()
    private val availableMoviesRental = AvailableMoviesRental()

    @Test
    fun `given 2 movies available for rental when execute then 2 movies are returned`() {
        val movie1 = Movie("1", "The Lion King", 1)
        val movie2 = Movie("2", "Inception", 2)
        movieRepository.save(movie1)
        movieRepository.save(movie2)

        val movies = availableMoviesRental.execute()

        assertEquals(2, movies.size)
    }
}

internal class FakeMovieRepository : MovieRepository {
    private val movies = mutableMapOf<String, Movie>()

    override fun getAll() = ArrayList(movies.values)

    override fun save(movie: Movie) { movies[movie.id] = movie }

}
