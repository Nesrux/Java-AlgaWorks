package com.nesrux.classesGenericas;

import com.nesrux.classesGenericas.estruturasdedados.ColecaoVaziaException;
import com.nesrux.classesGenericas.estruturasdedados.Pilha;
import com.nesrux.classesGenericas.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Pilha<Produto> pilha = new Pilha<>();

        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("feijão"));
        pilha.colocar(new Produto("Batata frita"));
        pilha.colocar(new Produto("Macarrão"));

        retirarTodos(pilha);
    }

    private static void retirarTodos(Pilha<Produto> produtos) {
        try {
            int i = 1;
            while (true) {
                Produto produto = produtos.retirar();
                System.out.printf("%d, %s%n", i, produto.getDescricao());
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Colecao de produtos esgotadas");
        }
    }

}
