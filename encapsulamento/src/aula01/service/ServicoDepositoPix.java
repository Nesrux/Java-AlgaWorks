package aula01.service;

import aula01.Cartao;
import aula01.Recibo;

public class ServicoDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
