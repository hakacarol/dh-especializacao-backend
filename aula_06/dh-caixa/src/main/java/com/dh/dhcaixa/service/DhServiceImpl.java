package com.dh.dhcaixa.service;

public class DhServiceImpl implements DhService {

    @Value("${notas}")
    private String notas;
    @Value("${moeda}")
    private String

    private Hash<String, Integer> caixa;

    public DhServiceImpl() {
        this.caixa = new HashMap<>();
    }

    @Override
    public void setQtdeNotas(String aux) {
        String[] qtd = aux.split(",");
        ArrayList<>(notas.split(",")).

        System.out.println(notas);
        System.out.println(moeda);
    }
}
