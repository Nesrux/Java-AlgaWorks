package desafioPolimorfismo.domain;

public class PessoaFisica extends Pessoa {
    private static final double RECEITA_ANUAL_INSENCAO = 500;
    private static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private final double receitaAnual;

    PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        return super.calcularImpostos();
    }
}
