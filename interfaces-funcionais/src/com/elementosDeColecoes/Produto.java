package com.elementosDeColecoes;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valor;
    private int quantidade;

    public Produto(String nome, BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void calcularPreco() {
        var preco = getValor().multiply(new BigDecimal(getQuantidade()));
        System.out.println(preco);
    }
}
