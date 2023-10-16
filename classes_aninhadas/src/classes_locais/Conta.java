package classes_locais;

import java.math.BigDecimal;

public class Conta {
    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    public Transacao efetuarPagamento(BigDecimal valor){
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        saldo = saldo.subtract(taxa).subtract(valor);

        return new Pagamento(taxa, valor);
    }
    public Transacao cobrarTarifa(BigDecimal valor){
        saldo = saldo.subtract(valor);
        return new Tarifa(valor);
    }

}
