package com.nesrux;

import com.nesrux.contaspagar.model.Horelite;
import com.nesrux.contaspagar.model.OrdemServico;
import com.nesrux.contaspagar.service.ServicoContaPagar;
import com.nesrux.pagamento.Beneficiario;
import com.nesrux.pagamento.DocumentoPagavel;
import com.nesrux.pagamento.Pix;
import com.nesrux.pagamento.Transferencia;

import java.util.UUID;

public class Principal {
    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(new Transferencia());

        Beneficiario funcionario = new Beneficiario("Jão da silva", UUID.randomUUID().toString(), "888-777");
        DocumentoPagavel documento = new Horelite(funcionario, 50, 250);

        Beneficiario fornecedor = new Beneficiario("Consultoria lima maria", UUID.randomUUID().toString(), "999-999");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 100);


        servicoContaPagar.pagar(documento);
        servicoContaPagar.pagar(ordemServico);
    }
}
