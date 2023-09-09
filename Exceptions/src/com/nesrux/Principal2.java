package com.nesrux;

import com.nesrux.estoque.Produto;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira gamer");
        produto.ativar();
        produto.setQuantidadeEstoque(10);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantidade: ");
        int quantidade = sc.nextInt();
        efetuarBaixaEstoque(produto, quantidade);
        sc.close();
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.removerDoEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque, estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
    }
}
