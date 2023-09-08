package com.nesrux.locadora;

public class LocacaoPorDiaSeguroItau extends LocacaoPorHora {
    public LocacaoPorDiaSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        var valorTotal = super.calcularValorDevido(horasUtilizadas);
        double dias = Math.ceil(horasUtilizadas / 24d);
        valorTotal += dias * 5;

        return valorTotal;
    }
}
