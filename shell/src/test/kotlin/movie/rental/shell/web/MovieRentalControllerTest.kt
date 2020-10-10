package movie.rental.shell.web

import movie.rental.AvailableRentalMovies
import movie.rental.catalogue.Movie
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest(MovieRentalController::class)
@MockBean(classes = [AvailableRentalMovies::class])
internal class MovieRentalControllerTest @Autowired constructor(
        private val mvc: MockMvc,
        private val availableRentalMovies: AvailableRentalMovies
) {

    @ParameterizedTest
    @EnumSource(AvailableMovieRequestsScenarios::class)
    fun `GET movies`(scenario: AvailableMovieRequestsScenarios) {
        `when`(availableRentalMovies.get()).thenReturn(scenario.availableMovies)

        mvc.get("/movies") {
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk }
            content {
                json(scenario.expectedContent)
            }
        }
    }

    enum class AvailableMovieRequestsScenarios(val availableMovies: List<Movie>, val expectedContent: String) {
        `no movies available`(listOf(), """{ movies: [] }"""),
        `1 movie available`(listOf(Movie("1", "Gladiator", 1)), """
            {
                movies: [
                    { id: "1", title: "Gladiator", price: 1 }
                ]
            }
        """.trimIndent())
    }
}
