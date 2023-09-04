package com.nesrux.contaspagar.service;

import com.nesrux.pagamento.DocumentoPagavel;
import com.nesrux.pagamento.MetodoPagamento;
import com.nesrux.pagamento.Pix;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        MetodoPagamento metodoPagamento = new Pix();
        /*Poderia ter outros métodos aqui
         * como por exemplo salvar essa transação
         * em um banco de dados*/
        metodoPagamento.pagar(documento);
    }
}
