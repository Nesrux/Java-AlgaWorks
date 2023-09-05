package com.nesrux.financeira.interfaces;

public interface ClienteFinanciavel {

     double calcularLimiteAprovado();

    default double calcularTaxaDeJuros(double taxaDeJuros){
         return 0;
    };
}
