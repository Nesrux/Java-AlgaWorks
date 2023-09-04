package com.nesrux.contaspagar.service;

import com.nesrux.pagamento.DocumentoPagavel;
import com.nesrux.pagamento.MetodoPagamento;

public class ServicoContaPagar {
    //Injeção de dependencia, nao depende dessa classe a instancia de documento
    //Pagavel
    //E também é uma inversão de controle, pois nao depende dessa classe a instancia de documentoPagavel

    private final MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        /*Poderia ter outros métodos aqui
         * como por exemplo salvar essa transação
         * em um banco de dados*/

        metodoPagamento.pagar(documento);
    }
}
