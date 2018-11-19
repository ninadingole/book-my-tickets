package com.iamninad.mbsys.v1.api.model;

import lombok.Data;

@Data
public class Movie {
    private String id;
    private String title;
    private String alias;
    private String language;
    private String imageUrl;
    private String genre;
    private String type;
}
