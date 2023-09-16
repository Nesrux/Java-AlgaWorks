package com.nesrux.classesGenericas.estruturasdedados;

import java.util.Arrays;

public class Fila<T> {
    private T[] itens;

    public Fila() {
        this.itens = (T[]) new Object[0];
    }

    public void colocar(T iten) {
        this.itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = iten;
    }

    public T retirar() {
        if (this.itens.length == 0) {
            throw new ColecaoVaziaException("Fila sem itens");
        }
        T item = itens[0];
        itens = Arrays.copyOfRange(itens, 1, itens.length);

        return item;
    }
}
