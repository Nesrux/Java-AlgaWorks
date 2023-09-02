package desafioPolimorfismo.domain;

public class EmpresaLucroReal extends PessoaJuridica {
    private static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double getLucroAnual() {
        return 0;
    }

    @Override
    public double calcularImpostos() {
        return super.calcularImpostos();
    }
}
