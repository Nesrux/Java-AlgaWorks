package com.nesrux.locadora;

public class Locacao {
    private Notebook notebook;
    private Precificacao precificacao;

    public Locacao(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao().calcularValorTotal(getNotebook(), horasUtilizadas);
        return valorTotal;
    }

}
