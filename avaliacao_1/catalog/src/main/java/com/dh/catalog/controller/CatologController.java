package com.dh.catalog.controller;

import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatologController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/{genre}")
    public String findMovies(@PathVariable String genre) {
        return catalogService.getMovies(genre);
    }

}