package com.nesrux.estoque;

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
        if (nome == null) {
            throw new NullPointerException("O nome do produto não pode ser nulo ");
        }
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

    public void removerDoEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("O argumento quantidade não pode ser negativo!");
        }
        if (isInanivo()) {
            throw new IllegalStateException("Não é possivel retitar o produto do estoque, pois ele esta inativo!");
        }
        if (getQuantidadeEstoque() - quantidade < 0) {
            throw new IllegalArgumentException("Não é possivel realizar esta operação," +
                    " pois o estoque deste produto ficara negativo");
        }
        setQuantidadeEstoque(getQuantidadeEstoque() - quantidade);
    }
}
