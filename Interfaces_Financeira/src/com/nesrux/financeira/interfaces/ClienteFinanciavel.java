package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {
    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;
    //Automaticamente o compilador vai transformar esse int numero teste em
    //Public static final int numeroTeste = 0
    //é a mesma ideia de nao colocar abstract em interfaces


    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isEmpresaDePequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        } else if (IsEmpresaDeMedioValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    private static boolean IsEmpresaDeMedioValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    private static boolean isEmpresaDePequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
