package br.com.rrs.rrmovies.movie.viewmodel.viewstate

import br.com.rrs.rrmovies.movie.model.Movies
import br.com.rrs.rrmovies.movie.model.Result

sealed class MovieViewState {
    data class MovieProgressBarVisible(val visibility: Int) : MovieViewState()
    data class MovieListLoaded(val movies: Movies) : MovieViewState()
    data class MovieError(val error: String) : MovieViewState()
    data class MovieProgressBarGone(val visibility: Int) : MovieViewState()
    data class MovieClicked(val movie: Result) : MovieViewState()
}