package desafio.domain.model;

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

    public double calcularSalario(int horasTrabalhadas){
        return getValorHora() * horasTrabalhadas;
    }
    public Horelite gerarOrelite(int horasTrabalhadas, String mesAno){
        return new Horelite(getNome(), mesAno, horasTrabalhadas);
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s%n, valorHora : %.2f%n", getNome(), getValorHora());
    }
}
