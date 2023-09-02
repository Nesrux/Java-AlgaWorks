package desafioPolimorfismo.domain;

public class Pessoa {
    private final String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularImpostos() {
        return 0;
    }
}
