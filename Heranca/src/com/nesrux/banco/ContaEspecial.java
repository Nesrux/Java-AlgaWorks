package com.nesrux.banco;

public class ContaEspecial extends ContaInvestimento {


    //Conta Especial
    private double limiteChequeEspecial;
    private double tarifaChequeEspecial;


    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
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

}
