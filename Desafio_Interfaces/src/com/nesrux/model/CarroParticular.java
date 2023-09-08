package com.nesrux.model;

public class CarroParticular extends VeiculoAutomotor {

    public static final double QUATRO_PORCENTO = 0.04;
    public static final double CINCO_PORCENTO = 0.05;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }


    @Override
    public double calcularValorPremio() {
        var valorPremio = getValorMercado();

        if (getAnoFabricacao() < 2000) {
            valorPremio *= CINCO_PORCENTO;
        }
        return valorPremio *= QUATRO_PORCENTO;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular no valor de R$%.2f, do modelo %s do ano de fabricação de %s",
                getValorMercado(), getModelo(), getAnoFabricacao());
    }
}
