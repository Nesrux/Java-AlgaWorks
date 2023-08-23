package aula01.service;

import aula01.Cartao;
import aula01.Recibo;

import java.util.Objects;

public class ServicoDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(String.format("O valor minimo de depósito é %f", Cartao.VALOR_MINIMO_DEPOSITO));
        }
        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;
        return new Recibo(cartao.titular, "deposito", valorDeposito);
    }
}
