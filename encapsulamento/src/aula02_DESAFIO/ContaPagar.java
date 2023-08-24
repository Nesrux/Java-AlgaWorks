package aula02_DESAFIO;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descicao;
    private double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    private boolean pago;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }


    public void pagar() {

    }

    public void cancelarPagamento() {
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    ContaPagar() {
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
