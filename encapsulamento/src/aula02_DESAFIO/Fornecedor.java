package aula02_DESAFIO;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    private String nome;

    Fornecedor() {
    }

    Fornecedor(String nome) {
        this.nome = nome;
    }
}
