package com.dh.dhcaixa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixa")
public class DhController {

    @Autowired
    private DhService service;

    @PostMapping()
    private ResponseEntity<Void>setQtdeNotas(@RequestParam String aux) {
        service.setQtdeNotas(aux);
        return ResponseEntity
    }

}
