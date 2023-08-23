package aula01.service;

import aula01.Cartao;
import aula01.Estabelecimento;
import aula01.Recibo;

public class ServicoPagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        cartao.saldo -= valor;
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente para realizar o pagamento");
        }
        return new Recibo(cartao.titular, "pagamento", valor);
    }
}
