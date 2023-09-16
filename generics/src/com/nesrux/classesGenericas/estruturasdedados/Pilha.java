package com.nesrux.classesGenericas.estruturasdedados;

import java.util.Arrays;

public class Pilha {

    private Object[] itens;


    public void colocar(Object item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public Object retirar() {
        if (itens.length == 0) {
            throw new PilhaVaziaException("Pilha sem itens");
        }
        Object item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);
        return item;
    }
}
