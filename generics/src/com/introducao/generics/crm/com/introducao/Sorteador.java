package com.introducao.generics.crm.com.introducao;

import com.introducao.generics.crm.Cliente;

import java.util.Random;

public class Sorteador {
    private static final Random RANDON = new Random();

    public static Cliente sortear(Cliente[] clientes) {
        if (clientes.length == 0) {
            throw new IllegalArgumentException("Minimo de 1 cliente");
        }
        int posicao = RANDON.nextInt(clientes.length);

        return clientes[posicao];
    }
}
