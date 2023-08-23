package aula01.service;

import aula01.Cartao;
import aula01.Estabelecimento;
import aula01.Recibo;

public class ServicoPagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
