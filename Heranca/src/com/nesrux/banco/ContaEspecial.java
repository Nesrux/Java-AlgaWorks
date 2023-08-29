package com.nesrux.banco;

public class ContaEspecial extends ContaInvestimento {


    //Conta Especial
    private double limiteChequeEspecial;
    private double tarifaChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTarifaChequeEspecial() {
        return tarifaChequeEspecial;
    }

    public void setTarifaChequeEspecial(double tarifaChequeEspecial) {
        this.tarifaChequeEspecial = tarifaChequeEspecial;
    }

    public void debitarTatifaMensal() {
        sacar(getTarifaChequeEspecial());
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser menor que 0");
        }
        if (getSaldoDisponivel() < valorSaque) {
            throw new IllegalArgumentException("saldo insulficiente para realizar saque");
        }
        setSaldo(getSaldo() - valorSaque);
    }

    @Override
    public void imprimirDemostrativo() {
        System.out.println();
        System.out.printf("Agencia de código: %d%n", getAgencia());
        System.out.printf("com.nesrux.banco.Conta de código: %d%n", getNumero());
        System.out.printf("com.nesrux.banco.Titular:  %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
        System.out.printf("Saldo disponivel %.2f", getSaldoDisponivel());
    }
}
