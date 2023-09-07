package com.nesrux.financeira.interfaces;

public interface EntidadeBonificavel extends  ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);
}
