package com.unchecked;

import com.unchecked.exception.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Motorola moto G 10");
        produto.setQuantidadeEstoque(10);
        produto.ativar();
        produto.removerDoEstoque(10);

        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
    }
}
