package com.nesrux.locadora;

public class LocacaoPorDia extends Locacao {
    public LocacaoPorDia(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int diasUtilizados) {
        double dias = Math.ceil(diasUtilizados / 24d);

        return getNotebook().getPrecoDia() * dias;
    }
}
