package com.introducao.generics.crm;

public class Pesquisador {

    public static Funcionario obterPorNome(Funcionario[] funcionarios, String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        throw new RuntimeException("Funcionario nao encontrado!");

    }
}
