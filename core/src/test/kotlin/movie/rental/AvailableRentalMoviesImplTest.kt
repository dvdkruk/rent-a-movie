package movie.rental

import movie.rental.catalogue.Movie
import movie.rental.catalogue.MovieRepository
import kotlin.test.*
import kotlin.test.Test

internal class AvailableRentalMoviesImplTest {
    private val movieRepository = FakeMovieRepository()
    private val availableMoviesRental = MovieRentalFactory(movieRepository).createAvailableMoviesForRental()

    @Test
    fun `given 2 available movies when requested then return the 2 movies`() {
        val movie1 = Movie("1", "The Lion King", 1)
        val movie2 = Movie("2", "Inception", 2)
        movieRepository.save(movie1)
        movieRepository.save(movie2)

        val movies = availableMoviesRental.execute()

        assertEquals(listOf(movie1, movie2), movies)
    }
}

internal class FakeMovieRepository : MovieRepository {
    private val movies = mutableMapOf<String, Movie>()

    override fun getAll() = ArrayList(movies.values)

    override fun save(movie: Movie) { movies[movie.id] = movie }

}
