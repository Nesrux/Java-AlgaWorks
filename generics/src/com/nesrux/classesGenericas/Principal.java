package com.nesrux.classesGenericas;

import com.nesrux.classesGenericas.estruturasdedados.Colecao;
import com.nesrux.classesGenericas.estruturasdedados.ColecaoVaziaException;
import com.nesrux.classesGenericas.estruturasdedados.Pilha;
import com.nesrux.classesGenericas.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Colecao<Produto> pilha = new Pilha<>();

        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("feijão"));
        pilha.colocar(new Produto("Batata frita"));
        pilha.colocar(new Produto("Macarrão"));

        retirarTodos(pilha);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("Gerson");
        nomes.colocar("Elma maria");
        nomes.colocar("two paypal");

        retirarTodos(nomes);
    }

    private static void retirarTodos(Colecao<?> objetos) {
        try {
            int i = 1;
            while (true) {
                Object objeto = objetos.retirar();
                System.out.printf("%d, %s%n", i, objeto);
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Colecao de produtos esgotadas");
        }
    }

}
