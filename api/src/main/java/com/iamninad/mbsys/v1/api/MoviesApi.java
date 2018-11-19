package com.iamninad.mbsys.v1.api;

import com.iamninad.mbsys.v1.api.model.Movie;

import java.util.List;

public interface MoviesApi {
    Movie get(String id);
    List<Movie> list(String language, String genre);
}
