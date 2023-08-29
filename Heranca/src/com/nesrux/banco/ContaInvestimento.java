package com.nesrux.banco;

public class ContaInvestimento {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    //Conta investimento
    private double valorTotalRendimentos;

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser menor que 0");
        }
        if (getSaldo() < valorSaque) {
            throw new IllegalArgumentException("saldo insulficiente para realizar saque");
        }
        this.saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 0) {
            throw new IllegalArgumentException("Você nao pode depositar valores negativos");
        }
        saldo += valorDeposito;
    }


    public void imprimirDemostrativo() {
        System.out.println();
        System.out.printf("Agencia de código: %d%n", getAgencia());
        System.out.printf("com.nesrux.banco.Conta de código: %d%n", getNumero());
        System.out.printf("com.nesrux.banco.Titular:  %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

}
