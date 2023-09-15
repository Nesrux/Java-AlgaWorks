package com.introducao.generics.crm;

public class Pesquisador {

    public static <T> T obterPorNome(T[] entidades, String nome) {
        for (T entidade : entidades) {

        }
        throw new RuntimeException("Funcionario nao encontrado!");

    }
}
