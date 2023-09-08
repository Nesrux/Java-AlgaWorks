package com.nesrux.locadora;

public class Notebook {
    private String nome;
    private double precoHora;
    private double precoDia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

    public Notebook(String nome, double precoHora, double precoDia) {
        this.nome = nome;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
    }
}
