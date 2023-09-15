package com.introducao.generics.crm;

public class Pesquisador {
    // isso é lower bound and upper bound
    public static <T extends Nomeavel> T obterPorNome(T[] entidades, String nome) {
        for (T entidade : entidades) {
            if (entidade.getNome().equals(nome)) {
                return entidade;
            }
        }
        throw new RuntimeException("Funcionario nao encontrado!");

    }
}
