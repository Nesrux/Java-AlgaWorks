package com.desafio.exception.banco;

import com.desafio.exception.banco.exceptions.ContaInativaException;
import com.desafio.exception.banco.exceptions.SaqueException;

public class ContaCorrente {

    private final String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (valor > getSaldo()) {
            throw new SaqueException("Não é possivel realizar essa operação, pois a conta nao pode ter" +
                    " dinheiro negativo");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta precisa estar ativa para realizar essa operação");
        }

        this.saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta precisa estar ativa para realizar essa operação");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta destino precisa estar ativa");
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
        }

    }

}
