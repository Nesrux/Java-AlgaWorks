package aula02_DESAFIO;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    private String nome;

    Fornecedor() {
    }

    Fornecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
