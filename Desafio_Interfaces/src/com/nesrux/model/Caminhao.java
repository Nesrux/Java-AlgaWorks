package com.nesrux.model;

public class Caminhao extends VeiculoAutomotor {
    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        var valoPremio = getValorMercado() * 0.02;
        valoPremio += getQuantidadeEixos() * 50;

        return valoPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão com o valor de mercado R$%.2f, e com %d eixos", getValorMercado(), getQuantidadeEixos());
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
}
