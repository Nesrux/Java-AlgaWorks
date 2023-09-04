package com.nesrux;

import com.nesrux.contaspagar.model.Horelite;
import com.nesrux.contaspagar.service.ServicoContaPagar;
import com.nesrux.pagamento.Beneficiario;
import com.nesrux.pagamento.DocumentoPagavel;

public class Principal {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("Jão da silva", "aerfs-asreer-asdgre-a123-s2", "888-777");
        DocumentoPagavel documento = new Horelite(funcionario, 50, 250);

        servicoContaPagar.pagar(documento);

    }
}
