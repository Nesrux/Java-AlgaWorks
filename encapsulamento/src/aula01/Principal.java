package aula01;

import aula01.service.ServicoDepositoPix;
import aula01.service.ServicoPagamentoOnline;

public class Principal {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado twoPaypal");
        var cartao = new Cartao("João da silva");

        var servicoDeDeposito = new ServicoDepositoPix();
        Recibo recibo = servicoDeDeposito.efetuarDeposito(cartao, 500);
        recibo.imprimir();

        var servicoPagamento = new ServicoPagamentoOnline();
        Recibo recibo1 = servicoPagamento.efetuarPagamento(supermercado, cartao,180);
        recibo1.imprimir();

        System.out.printf("TITULAR: %s %n", cartao.titular);
        System.out.printf("TITULAR: %2f %n", cartao.saldo);
    }
}
