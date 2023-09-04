package com.nesrux;

import com.nesrux.contaspagar.model.Horelite;
import com.nesrux.contaspagar.service.ServicoContaPagar;
import com.nesrux.pagamento.Beneficiario;
import com.nesrux.pagamento.DocumentoPagavel;

import java.util.UUID;

public class Principal {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("Jão da silva", UUID.randomUUID().toString(), "888-777");
        DocumentoPagavel documento = new Horelite(funcionario, 50, 250);

        servicoContaPagar.pagar(documento);

    }
}
