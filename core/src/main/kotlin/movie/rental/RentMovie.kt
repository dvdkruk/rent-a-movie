package movie.rental

interface RentMovie {
    fun rent(movieId: String): Boolean
}

fun createRentMovie(): RentMovie = RentMovieImpl()

private class RentMovieImpl: RentMovie {
    override fun rent(movieId: String): Boolean {
        TODO("Not yet implemented")
    }
}
