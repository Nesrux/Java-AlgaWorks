package com.nesrux.financeira;

import com.nesrux.financeira.interfaces.EntidadeBonificavel;
import com.nesrux.financeira.modelo.Funcionario;
import com.nesrux.financeira.servico.ServicoPagamentoBonus;

public class Principal2 {
    public static void main(String[] args) {
        EntidadeBonificavel funcionario = new Funcionario("João marcos", 123456);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 25);
    }
}
