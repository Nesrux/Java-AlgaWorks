package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isEmpresaPequena(valorSolicitado)) {
            return 1.0;
        } else if (IsEmpresaMedia(valorSolicitado)) {
            return 1.5;
        }
        return 2.0;
    }

    private static boolean IsEmpresaMedia(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    private static boolean isEmpresaPequena(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
