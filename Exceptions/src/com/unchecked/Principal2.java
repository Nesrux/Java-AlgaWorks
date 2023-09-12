package com.unchecked;

import com.unchecked.exception.estoque.Produto;
import com.unchecked.exception.estoque.ProdutoInativoException;
import com.unchecked.exception.estoque.ProdutoSemEstoqueException;

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
        } catch (ProdutoSemEstoqueException e) {
            System.out.println("Não foi possível realizar esta operação, não existe estoque deste produto");
            comprar(produto);
        } catch (IllegalArgumentException ila) {
            System.out.println(ila.getMessage());
        } catch (ProdutoInativoException ex) {
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
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.removerDoEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque, estoque atual: %d%n", quantidade, produto.getQuantidadeEstoque());
    }
}
