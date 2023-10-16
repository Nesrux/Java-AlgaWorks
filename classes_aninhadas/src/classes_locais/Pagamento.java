package classes_locais;

import java.math.BigDecimal;

public class Pagamento implements Transacao {
    private BigDecimal taxa;
    private BigDecimal valor;

    public Pagamento(BigDecimal taxa, BigDecimal valor) {
        this.taxa = taxa;
        this.valor = valor;
    }

    @Override
    public BigDecimal getValorTotal() {
        return this.valor.add(taxa);
    }
}
