package com.introducao.generics;

import com.introducao.generics.crm.Cliente;
import com.introducao.generics.crm.com.introducao.Sorteador;

public class Principal2 {

    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("jailton", 4_555),
                new Cliente("Gerson cortesias", 8_555),
                new Cliente("Jalim rabei", 10_000)
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
    }
}
