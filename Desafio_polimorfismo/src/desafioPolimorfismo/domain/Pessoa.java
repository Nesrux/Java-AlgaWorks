package desafioPolimorfismo.domain;

public abstract class Pessoa {
    private final String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularImpostos();
}
