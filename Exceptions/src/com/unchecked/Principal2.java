package com.unchecked;

import com.unchecked.exception.estoque.Produto;
import com.unchecked.exception.estoque.exceptions.BaixaEstoqueException;
import com.unchecked.exception.estoque.exceptions.ProdutoException;
import com.unchecked.exception.estoque.exceptions.ProdutoInativoException;
import com.unchecked.exception.estoque.exceptions.ProdutoSemEstoqueException;

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
        System.out.print("quantidade: ");
        int quantidade = sc.nextInt();

        try {
            efetuarBaixaEstoque(produto, quantidade);
        } catch (BaixaEstoqueException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        sc.close();
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {
        try {
            produto.removerDoEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque, estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
        } catch (ProdutoException | IllegalArgumentException e) {
            throw new BaixaEstoqueException(e.getMessage());
        }
    }
}
