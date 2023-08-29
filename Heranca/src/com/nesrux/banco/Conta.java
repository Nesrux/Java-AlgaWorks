package com.nesrux.banco;

public class Conta {
    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;


    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipo = NORMAL;

    //Conta investimento
    private double valorTotalRendimentos;

    //Conta Especial
    private double limiteChequeEspecial;
    private double tarifaChequeEspecial;

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

    public int getTipo() {
        return tipo;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void setTipo(int tipo) {
        if (tipo != NORMAL && tipo != INVESTIMENTO && tipo != ESPECIAL) {
            throw new IllegalArgumentException(String.format("Tipo inválido: %d", tipo));
        }
        if (getTipo() != ESPECIAL) {
            this.limiteChequeEspecial = 0;
        }
        this.tipo = tipo;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        if (getTipo() != NORMAL) {
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
        } else {
            throw new RuntimeException("Tipo de conta inválida");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (getTipo() != ESPECIAL) {
            throw new RuntimeException("Esse tipo de conta nao permite limite de cheque Especial");
        }
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getTarifaChequeEspecial() {
        return tarifaChequeEspecial;
    }

    public void setTarifaChequeEspecial(double tarifaChequeEspecial) {
        this.tarifaChequeEspecial = tarifaChequeEspecial;
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser menor que 0");
        }
        if (getSaldoDisponivel() < valorSaque) {
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

    public void debitarTatifaMensal() {
        if (getTipo() == ESPECIAL) {
            sacar(getTarifaChequeEspecial());
        } else {
            throw new RuntimeException("Não pode debitar tarifa especial nesse  tipo de conta");
        }
    }


    public void imprimirDemostrativo() {
        System.out.println();
        System.out.printf("Agencia de código: %d%n", getAgencia());
        System.out.printf("com.nesrux.banco.Conta de código: %d%n", getNumero());
        System.out.printf("com.nesrux.banco.Titular:  %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

}
