package desafio.domain.model;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return getValorHora() * horasTrabalhadas;
    }

    public Horelite gerarOrelite(int horasTrabalhadas, String mesAno) {
        return new Horelite(getNome(), mesAno, calcularSalario(horasTrabalhadas));
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s, valorHora : %.2f", getNome(), getValorHora());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
