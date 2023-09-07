package com.nesrux.model;

import com.nesrux.interfaces.BemSeguravel;

public class ImovelResidencial implements BemSeguravel {
    public static final double UM_PORCENTO = 0.01;
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        //0,1 do valor de mercado + 30 centavos para cada métro de area contruida
        var valorMercadoMaisAcressimo = getValorMercado() + (getValorMercado() * UM_PORCENTO);
        double valorAdicionalPorMetro = getAreaConstruida() * 0.30;
        System.out.println(valorAdicionalPorMetro);


        return valorMercadoMaisAcressimo + valorAdicionalPorMetro;
    }

    @Override
    public String descrever() {
        return null;
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
