package com.elementosDeColecoes;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private StatusProduto status = StatusProduto.ATIVO;

    public Produto(String nome, BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal valor, int quantidade, StatusProduto status) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.status = status;
    }

    public StatusProduto getStatus() {
        return status;
    }

    public void setStatus(StatusProduto status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", status=" + status +
                '}';
    }

    public enum StatusProduto {
        ATIVO, INATIVO
    }
}
