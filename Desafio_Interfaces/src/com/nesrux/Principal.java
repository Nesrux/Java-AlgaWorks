package com.nesrux;

import com.nesrux.model.ImovelResidencial;
import com.nesrux.service.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ImovelResidencial imovel = new ImovelResidencial(100_000, 100);
        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

        servico.emitir(imovel);
    }
}
