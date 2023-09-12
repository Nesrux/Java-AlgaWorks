package com.unchecked.exception.estoque;

import java.util.Objects;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome dese ser informado");

        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInanivo() {
        return !isAtivo();
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void removerDoEstoque(int quantidade) throws ProdutoSemEstoqueException {
        if (quantidade < 0) {
            throw new IllegalArgumentException("quantidade não pode ser negativa!");
        }
        if (isInanivo()) {
            throw new ProdutoInativoException("Não é possivel retitar o produto do estoque, pois ele esta inativo!");
        }
        if (getQuantidadeEstoque() - quantidade < 0) {
            throw new ProdutoSemEstoqueException(getQuantidadeEstoque());
        }
        setQuantidadeEstoque(getQuantidadeEstoque() - quantidade);
    }
}
