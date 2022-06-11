package com.dh.catalog.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CatalogService {
    List<Object> getMovies(String genre);
}
