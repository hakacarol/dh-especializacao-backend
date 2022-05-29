package com.dh.aula01currencyconverterservice.service;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService{

    @Override
    public Double convertCoin(Double valueCoin) {
        return valueCoin * 4.74;
    }
}
