package com.nesrux.model;

public class CarroParticular extends VeiculoAutomotor {
    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }


    @Override
    public double calcularValorPremio() {
        return 0;
    }

    @Override
    public String descrever() {
        return null;
    }
}
