package com.nesrux.banco;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

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

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void validarSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new IllegalArgumentException("saldo insulficiente para realizar saque");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser menor que 0");
        }
        validarSaque(valorSaque);
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
        System.out.printf("Conta de código: %d%n", getNumero());
        System.out.printf("Titular:  %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

}
