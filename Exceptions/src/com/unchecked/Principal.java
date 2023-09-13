package com.unchecked;

import com.unchecked.exception.estoque.Produto;
import com.unchecked.exception.estoque.exceptions.ProdutoInativoException;
import com.unchecked.exception.estoque.exceptions.ProdutoSemEstoqueException;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Motorola moto G 10");
        produto.setQuantidadeEstoque(10);
        produto.ativar();
        try {
            produto.removerDoEstoque(10);
        } catch (ProdutoSemEstoqueException | ProdutoInativoException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
    }
}
