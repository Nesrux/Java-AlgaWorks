package com.nesrux.locadora;

public abstract class Locacao {
    private final Notebook notebook;

    public Locacao(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public abstract double calcularValorDevido(int horasUtilizadas);
}
