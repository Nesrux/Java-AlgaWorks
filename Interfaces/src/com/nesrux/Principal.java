package com.nesrux;

import com.nesrux.contaspagar.service.ServicoContaPagar;
import com.nesrux.pagamento.DocumentoPagavel;

public class Principal {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        //TODO precisamos instanciar uma classe documentoPagavel
        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);

    }
}
