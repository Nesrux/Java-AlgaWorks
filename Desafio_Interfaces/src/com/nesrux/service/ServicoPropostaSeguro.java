package com.nesrux.service;

import com.nesrux.interfaces.BemSeguravel;

public class ServicoPropostaSeguro {
    public void emitir(BemSeguravel bemSeguravel) {
        System.out.println("-------------------");
        System.out.println("Proposta de seguro");
        System.out.println("-------------------");
        System.out.println(bemSeguravel.descrever());
        System.out.printf("Premio: %.2f", bemSeguravel.calcularValorPremio());


    }
}
