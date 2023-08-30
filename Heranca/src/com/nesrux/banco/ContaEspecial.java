package com.nesrux.banco;

public class ContaEspecial extends ContaInvestimento {
    private double limiteChequeEspecial;
    private double tarifaEspecial;

     public ContaEspecial(Titular titular, int agencia, int numero, double tarifaEspecial) {
        super(titular, agencia, numero);
        this.tarifaEspecial = tarifaEspecial;
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
        return tarifaEspecial;
    }

    public void setTarifaChequeEspecial(double tarifaChequeEspecial) {
        this.tarifaEspecial = tarifaChequeEspecial;
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
