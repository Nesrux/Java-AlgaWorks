package classes_aninhadas_nao_estaticas;

import java.math.BigDecimal;

public class Transacao {
    private String descricao;
    private BigDecimal valor;

    public Transacao(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
