package com.unchecked;

import com.unchecked.exception.estoque.Produto;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira gamer");
        // produto.ativar();
        produto.setQuantidadeEstoque(10);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner sc = new Scanner(System.in);
        System.out.print("quantidade: ");
        int quantidade = sc.nextInt();

        try {
            efetuarBaixaEstoque(produto, quantidade);
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível realizar esta operação, pois foi informado valor inválido");
            comprar(produto);
        } catch (IllegalStateException ex) {
            System.out.println("O produto não esta ativo, desaja ativar? ");

            if (sc.nextBoolean()) {
                produto.ativar();
                System.out.println("Produto ativado!");
                comprar(produto);
            } else {
                System.out.println("Compra não pode ser realizada");
            }
        }

        sc.close();
        System.out.println("Compra feita com sucesso!");
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.removerDoEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque, estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
    }
}
