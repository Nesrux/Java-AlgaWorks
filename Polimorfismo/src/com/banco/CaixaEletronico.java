package com.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMOSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d%d para %d/%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);

    }

    public void imprimirDemostrativo(Conta conta) {
        if (conta instanceof ContaEspecial) {
            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
            if (contaInvestimento.getValorTotalRendimentos() > 0) {
                System.out.println("Impressao é gratuita");
            } else {
                System.out.printf("Custo da impressao: R$:%.2f%n", TARIFA_IMPRESSAO_DEMOSTRATIVO);
                conta.sacar(TARIFA_IMPRESSAO_DEMOSTRATIVO);
            }
        }
        conta.imprimirDemonstrativo();
    }
}
