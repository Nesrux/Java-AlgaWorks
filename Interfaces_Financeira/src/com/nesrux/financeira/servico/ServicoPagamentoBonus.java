package com.nesrux.financeira.servico;

import com.nesrux.financeira.interfaces.EntidadeBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(EntidadeBonificavel entidade, double percentualMetaAlcancada) {
        double valorBonus = entidade.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bonus pago no valor de  %.2f%n", valorBonus);
    }
}
