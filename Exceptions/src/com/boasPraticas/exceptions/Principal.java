package com.boasPraticas.exceptions;

public class Principal {
    public static void main(String[] args) {
        ServicoCadastroCliente servico = new ServicoCadastroCliente();
        Cliente cliente = servico.cadastrar("João", 8);

        System.out.println("cliente cadastrado: " + cliente.getNome());
    }
}
