package desafioPolimorfismo.domain;

public class GestorImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoa) {
        this.valorTotalImpostos = pessoa.calcularImpostos();
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
    }

    public void adicionar(Pessoa... pessoas) {
        for (Pessoa pessoa : pessoas) {
            this.valorTotalImpostos = pessoa.calcularImpostos();
            System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());

        }

    }

}
