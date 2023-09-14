package com.boasPraticas.exceptions;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            return null;
        }

        return new Cliente(nome, idade);
    }
}
