package com.iamninad.bmt.moviedb.service;

import com.iamninad.mbsys.v1.api.MoviesApi;
import com.iamninad.mbsys.v1.api.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MoviesServiceApi implements MoviesApi {


    @Override
    @GetMapping(value = "/{id}", produces = "application/vnd.iamninad.bmt-v1+json")
    public Movie get(String id) {
        return null;
    }

    @Override
    @GetMapping(value = "/", produces = "application/vnd.iamninad.bmt-v1+json")
    public List<Movie> list(@PathVariable("lang") String language,@PathVariable("genre") String genre) {
        return null;
    }

}
