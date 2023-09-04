package com.nesrux.financeira.servico;

import com.nesrux.financeira.modelo.Empresa;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(Empresa empresa, double valorSolicitado) {
        double limiteAprovado = empresa.getLimiteAprovado();

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamente não aprovado. Limite de %.2f", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado. limite máximo de %.2f%n", limiteAprovado);

    }

    public double consultarLimiteAProvado(Empresa empresa) {
        return 2.0;
    }
}
