package com.nesrux.financeira;

import com.nesrux.financeira.modelo.Fazenda;
import com.nesrux.financeira.modelo.Industria;
import com.nesrux.financeira.servico.ServicoFinanciamento;

public class Principal {
    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda();
        var industria = new Industria();

        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
    }
}
