package movie.rental.shell.config

import movie.rental.AvailableRentalMovies
import movie.rental.catalogue.MovieRepository
import movie.rental.createAvailableRentalMovies
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class MovieRentalConfig {

    @Bean
    fun availableMoviesForRental(movieRepository: MovieRepository): AvailableRentalMovies {
        return createAvailableRentalMovies(movieRepository)
    }

}
