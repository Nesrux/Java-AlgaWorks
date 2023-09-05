package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {

     double calcularLimiteAprovado();

    default double calcularTaxaDeJuros(double valorSolicitado){
       if(valorSolicitado <= 100_000){
           return 1.0;
       } else if (valorSolicitado <= 1_000_000) {
           return 1.5;
       }

        return 2.0;
    }
}
