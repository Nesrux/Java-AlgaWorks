package com.nesrux.pagamento;

public class Transferencia implements MetodoPagamento {
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiario não possui uma conta bancaria");
        }
        System.out.printf("DEBUG: efetuando uma transferencia para %s, no valor de %.2f com a conta bancaria %s%n", beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());

    }
}
