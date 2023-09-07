package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {
    //Automaticamente o compilador vai transformar esse int numero teste em
    //Public static final int numeroTeste = 0
    //é a mesma ideia de nao colocar abstract em interfaces

    int numeroTeste = 12;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isEmpresaDePequenoValor(valorSolicitado)) {
            return 1.0;
        } else if (IsEmpresaDeMedioValor(valorSolicitado)) {
            return 1.5;
        }
        return 2.0;
    }

    private static boolean IsEmpresaDeMedioValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    private static boolean isEmpresaDePequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
