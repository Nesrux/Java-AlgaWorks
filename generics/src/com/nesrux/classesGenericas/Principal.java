package com.nesrux.classesGenericas;

import com.nesrux.classesGenericas.estruturasdedados.Pilha;
import com.nesrux.classesGenericas.loja.Produto;

public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("feijão"));

        Produto produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        Produto produto2 = (Produto) pilha.retirar();
        System.out.println(produto2.getDescricao());


    }

}
