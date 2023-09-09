package com.nesrux;

import com.nesrux.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Motorola moto G 10");
        produto.setQuantidadeEstoque(10);

        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
    }
}
