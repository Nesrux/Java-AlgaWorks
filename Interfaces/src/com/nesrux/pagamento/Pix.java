package com.nesrux.pagamento;

public class Pix implements MetodoPagamento {
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiario não possui chave Pix");
        }
        System.out.printf("DEBUG: efetuando PIX para %s, no valor de %.2f com a chave pix %s%n", beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());

    }

}

