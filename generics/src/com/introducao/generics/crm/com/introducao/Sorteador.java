package com.introducao.generics.crm.com.introducao;

import com.introducao.generics.crm.Cliente;

import java.util.Random;

public class Sorteador {
    private static final Random RANDON = new Random();

    public static <T> T sortear(T[] objetos) {
        if (objetos.length == 0) {
            throw new IllegalArgumentException("Minimo de 1 cliente");
        }
        int posicao = RANDON.nextInt(objetos.length);

        return objetos[posicao];
    }
}
