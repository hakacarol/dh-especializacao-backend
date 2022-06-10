package com.dh.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    public String getMovies(String genre) {
        return movieFeign.findMovies(genre);
    };


}
