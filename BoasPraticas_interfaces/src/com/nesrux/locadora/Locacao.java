package com.nesrux.locadora;

import java.util.Objects;

public class Locacao {
    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao()
                .calcularValorTotal(getNotebook(), horasUtilizadas);
        if (getSeguro() != null) {
            valorTotal += getSeguro().valorPremio(horasUtilizadas, valorTotal);
        }
        return valorTotal;
    }

}
