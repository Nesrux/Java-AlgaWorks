package desafioPolimorfismo.domain;

public class EmpresaSimples extends PessoaJuridica {
    private static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.05;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double getLucroAnual() {
        return 0;
    }

    @Override
    public double calcularImpostos() {
        return 0;
    }
}
