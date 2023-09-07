package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {

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
