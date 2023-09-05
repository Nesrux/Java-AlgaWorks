package com.nesrux.financeira.modelo;

import com.nesrux.financeira.repository.ClienteFinanciavel;

public class ParceiroFinanceiro extends Empresa implements ClienteFinanciavel {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularLimiteAprovado() {
        return 0;
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorTotalAplicado) {
        this.valorTotalAplicado += valorTotalAplicado;
    }
}
