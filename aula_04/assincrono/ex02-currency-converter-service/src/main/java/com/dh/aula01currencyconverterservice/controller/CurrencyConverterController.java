package com.dh.aula01currencyconverterservice.controller;

import com.dh.aula01currencyconverterservice.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class CurrencyConverterController {

    @Autowired
    private CurrencyConverterService currencyConverterService;

    @GetMapping("/{valueCoin}&from=BRL&to=USD")
    public Double convertCoin(@PathVariable("valueCoin") Double valueCoin) {
        return currencyConverterService.convertCoin(valueCoin);
    }
}
