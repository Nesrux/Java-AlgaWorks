package com.nesrux.classesGenericas.estruturasdedados;

public interface Colecao<T> {
    void colocar(T item);

    T retirar();
}
