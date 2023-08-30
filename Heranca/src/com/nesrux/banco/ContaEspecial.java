package com.nesrux.banco;

public class ContaEspecial extends ContaInvestimento {
    private double limiteChequeEspecial;
    private double tarifaChequeEspecial;

     public ContaEspecial(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

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
    protected void validarSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new IllegalArgumentException("saldo insulficiente para realizar saque");
        }
    }

    @Override
    public void imprimirDemostrativo() {
        super.imprimirDemostrativo();
        System.out.printf("Saldo disponivel %.2f", getSaldoDisponivel());
    }
}
