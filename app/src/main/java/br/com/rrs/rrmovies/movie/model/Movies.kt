package br.com.rrs.rrmovies.movie.model

data class Movies(
    val dates: Dates,
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)