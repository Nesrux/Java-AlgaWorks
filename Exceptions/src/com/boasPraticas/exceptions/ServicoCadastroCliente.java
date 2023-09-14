package com.boasPraticas.exceptions;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) {
        if (idade < 18) {
            throw new IllegalStateException("O cliente não pode ter idade menor que 18 anos");
        }

        return new Cliente(nome, idade);
    }
}
