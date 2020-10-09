package movie.rental.shell.config

import movie.rental.MovieRentalFactory
import movie.rental.MovieRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class MovieRentalConfig(movieRepository: MovieRepository) {

    private val factory = MovieRentalFactory(movieRepository)

    @Bean
    fun availableMoviesForRental() = factory.createAvailableMoviesForRental()

}
