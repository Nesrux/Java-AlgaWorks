package com.nesrux.model;

import com.nesrux.interfaces.BemSeguravel;

public class ImovelResidencial implements BemSeguravel {
    public static final double UM_PORCENTO = 0.01;
    public static final double TRINTA_PORCENTO = 0.3;
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        //0,1 do valor de mercado + 30 centavos para cada métro de area contruida
        double valorPremio = getValorMercado() * UM_PORCENTO;
        valorPremio += TRINTA_PORCENTO;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Imovel residencial com %dm2 de área contruída, avaliado em %.2f", getAreaConstruida(), getValorMercado());
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
}
