package ClassesAbistratas.com.nesrux.domain;

public class NotaFiscalServico extends NotaFiscal {
    public static final double ALIQUOTA_IMPOSTOS = 0.18;
    public static final int VALOR_MAXIMO_INSENCAO_IMPOSTOS = 1000;

    private boolean interMunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean interMunicipal) {
        super(descricao, valorTotal);
        this.interMunicipal = interMunicipal;
    }

    public boolean isInterMunicipal() {
        return interMunicipal;
    }

    @Override
    public double calcularImposto() {
        var valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;

        if (isInsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isInsentoImpostos() {
        return isInterMunicipal() && getValorTotal() <= VALOR_MAXIMO_INSENCAO_IMPOSTOS;
    }
}
