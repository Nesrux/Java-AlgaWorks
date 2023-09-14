package com.desafio.exception.banco;

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
            throw new IllegalStateException("Não é possivel realizar essa operação, pois a conta nao pode ter" +
                    " dinheiro negativo");
        }

        if (isInativa()) {
            throw new IllegalStateException("Conta precisa estar ativa para realizar essa operação");
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (isInativa()) {
            throw new IllegalStateException("Conta precisa estar ativa para realizar essa operação");
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if (contaDestino.isInativa()) {
            System.out.println("Conta de destino está inativa");
            return false;
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }

}
